package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Airline;
import com.example.exception.RecordAlreadyPresentException;
import com.example.exception.RecordNotFoundException;
import com.example.service.AirlineService;



	@CrossOrigin
	@RestController
	@RequestMapping("/airline")
	public class AirlineController {
		@Autowired
		AirlineService airlineService;

		@GetMapping("/viewAirline/{id}")
		@ExceptionHandler(RecordNotFoundException.class)
		public Airline viewAirport(@PathVariable("id") int Airlineid) {
			return airlineService.viewAirport(Airlineid);
		}

		@GetMapping("/allAirline")
		public Iterable<Airline> viewAllAirport() {
			return airlineService.viewAllAirport();
		}

		@PostMapping("/addAirline")
		@ExceptionHandler(RecordAlreadyPresentException.class)
		public void addAirport(@RequestBody Airline airline) {
			airlineService.addAirport(airline);
		}

		@PutMapping("/updateAirline")
		@ExceptionHandler(RecordNotFoundException.class)
		public void modifyAirport(@RequestBody Airline airport) {
			airlineService.modifyAirport(airport);
		}

		@DeleteMapping("/deleteAirline/{id}")
		@ExceptionHandler(RecordNotFoundException.class)
		public void removeAirport(@PathVariable("id") int Airlineid) {
			airlineService.removeAirport(Airlineid);
		}
	}


