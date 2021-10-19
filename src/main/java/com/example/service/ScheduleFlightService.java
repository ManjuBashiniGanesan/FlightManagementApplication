package com.example.service;

import java.util.Optional;

import com.example.entities.ScheduleFlight;

public interface ScheduleFlightService {
	public ScheduleFlight addScheduledFlight(ScheduleFlight scheduledFlight);

	public ScheduleFlight modifyScheduledFlight(ScheduleFlight scheduledFlight);

	public String removeScheduledFlight(int id);

	public Iterable<ScheduleFlight> viewAllScheduledFlights();

	public Optional<ScheduleFlight> viewScheduledFlight(int flightId) ;

}
