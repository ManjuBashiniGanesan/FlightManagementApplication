package com.example.service;

import com.example.entities.Airline;

public interface AirlineService {
	public Iterable<Airline> viewAllAirport();

	public Airline viewAirport(int Airlineid);

	public Airline addAirport(Airline airline);

	public Airline modifyAirport(Airline airline);

	public String removeAirport(int Airlineid);

}
