package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dao.FlightRepository;
import com.example.entities.Flight;
import com.example.exception.RecordAlreadyPresentException;
import com.example.exception.RecordNotFoundException;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightRepository flightrepo;

	/*
	 * add a flight
	 */
	@Override
	public ResponseEntity<Flight> addFlight(Flight flight) {
		Optional<Flight> findById = flightrepo.findById(flight.getFlightNo());
		try {
		if (!findById.isPresent()) {
			flightrepo.save(flight);
			return new ResponseEntity<Flight>(flight,HttpStatus.OK);
		} else
			throw new RecordAlreadyPresentException("Flight with number: " + flight.getFlightNo() + " already present");
	}
		catch(RecordAlreadyPresentException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * view all flights
	 */
	@Override
	public Iterable<Flight> viewAllFlight() {
		return flightrepo.findAll();
	}

	/*
	 * search a flight
	 */
	@Override
	public Flight viewFlight(int flightNumber) {
		Optional<Flight> findById = flightrepo.findById(flightNumber);
		if (findById.isPresent()) {
			return findById.get();
		}
		else
			throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");
	    }
		/*catch(RecordNotFoundException e)
		{
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}*/

	/*
	 * modify a flight
	 */
	@Override
	public Flight modifyFlight(Flight flight) {
		Optional<Flight> findById = flightrepo.findById(flight.getFlightNo());
		if (findById.isPresent()) {
			flightrepo.save(flight);
		} else
			throw new RecordNotFoundException("Flight with number: " + flight.getFlightNo() + " not exists");
		return flight;
	}

	/*
	 * remove a flight
	 */
	public String removeFlight(int flightNumber) {
		Optional<Flight> findById = flightrepo.findById(flightNumber);
		if (findById.isPresent()) {
			flightrepo.deleteById(flightNumber);
			return "Flight removed!!";
		} else
			throw new RecordNotFoundException("Flight with number: " + flightNumber + " not exists");

	}


}
