package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SeatRepository;
import com.example.entities.Seat;

@Service
public class SeatServiceImpl implements SeatService {
	@Autowired
	SeatRepository seatrepo;

	@Override
	public void addSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatrepo.save(seat);
		
	}

	@Override
	public Iterable<Seat> viewAllSeats() {
		// TODO Auto-generated method stub
		return seatrepo.findAll();
	}

}
