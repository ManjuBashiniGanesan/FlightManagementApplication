package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ScheduleFlight;
import com.example.exception.RecordNotFoundException;
import com.example.service.AirlineService;
import com.example.service.FlightService;
import com.example.service.ScheduleFlightService;

@RestController
	@CrossOrigin
	@RequestMapping("/scheduledFlight")
	public class ScheduleFlightController {
		/*
		 * Creating Service object
		 */
		@Autowired
		ScheduleFlightService scheduleFlightService;

		@Autowired
		AirlineService airportService;

		@Autowired
		FlightService flightService;

		/*
		 * Controller for adding Scheduled Flights
		 */
		@PostMapping("/add")
		public ScheduleFlight addScheduleFlight( ScheduleFlight scheduledFlight){
				return  scheduleFlightService.addScheduledFlight(scheduledFlight);
		}

		/*
		 * Controller for modifying existing Scheduled Flights
		 */
		@PutMapping("/modify")
		public ScheduleFlight modifyScheduleFlight(ScheduleFlight scheduleFlight) {
			return scheduleFlightService.modifyScheduledFlight(scheduleFlight);
		}

		/*
		 * Controller for deleting existing Scheduled Flights
		 */
		@DeleteMapping("/delete")
		public String deleteSF(@RequestParam int flightId) throws RecordNotFoundException {
			return scheduleFlightService.removeScheduledFlight(flightId);
		}

		

		/*
		 * Controller for viewing all Scheduled Flights
		 */
		@GetMapping("/viewAll")
		public Iterable<ScheduleFlight> viewAllSF() {
			return scheduleFlightService.viewAllScheduledFlights();
		}
		



}
