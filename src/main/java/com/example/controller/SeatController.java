package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Seat;
import com.example.service.SeatService;



@CrossOrigin
@RestController
@RequestMapping("/seat")
public class SeatController {
	@Autowired
	SeatService seatService;
	
	@PostMapping("/addSeat")
	public void addSeat(@RequestBody Seat seat) {
		seatService.addSeat(seat);
	}
	@GetMapping("/viewSeat")
	public Iterable<Seat> viewAllSeats(){
		return seatService.viewAllSeats();
	}

	

}
