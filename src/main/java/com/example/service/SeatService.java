package com.example.service;

import com.example.entities.Seat;

public interface SeatService {
	public void addSeat(Seat seat);
	public Iterable<Seat>viewAllSeats();

}
