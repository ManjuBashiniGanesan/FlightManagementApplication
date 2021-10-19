package com.example.service;

import org.springframework.http.ResponseEntity;

import com.example.entities.Flight;

public interface FlightService {
	public ResponseEntity<?> addFlight(Flight flight);

	public Iterable<Flight> viewAllFlight();

	public Flight viewFlight(int flightNumber);

	public Flight modifyFlight(Flight flight);

	public String removeFlight(int flightNumber);


}
