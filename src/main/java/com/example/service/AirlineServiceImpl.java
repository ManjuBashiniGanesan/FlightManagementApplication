package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AirlineRepository;
import com.example.entities.Airline;
import com.example.exception.RecordNotFoundException;
@Service
public class AirlineServiceImpl implements AirlineService {
	@Autowired
	AirlineRepository airline_repository;

	@Override
	public Iterable<Airline> viewAllAirport() {
		// TODO Auto-generated method stub
		return airline_repository.findAll();
	}

	@Override
	public Airline viewAirport(int Airlineid) {
		// TODO Auto-generated method stub
		Optional<Airline> findById = airline_repository.findById(Airlineid);
		if (findById.isPresent()) {
			return findById.get();
		}
			
			//return new ResponseEntity<Airport>(airport, HttpStatus.OK)}
		else
			throw new RecordNotFoundException("Airport with airport code: " + Airlineid + "not exists");
	    }
	

	@Override
	public Airline addAirport(Airline airline) {
		// TODO Auto-generated method stub
		return airline_repository.save(airline);
			}

	@Override
	public Airline modifyAirport(Airline Airlineid) {
		// TODO Auto-generated method stub
		return airline_repository.save(Airlineid);
	}
	

	@Override
	public String removeAirport(int Airlineid) {
		// TODO Auto-generated method stub
		Optional<Airline> findById = airline_repository.findById(Airlineid);
		if (findById.isPresent()) {
			airline_repository.deleteById(Airlineid);
			return "Airline removed";
		} else
			throw new RecordNotFoundException("Airline with code: " + Airlineid + " not exists");

	}

	}


