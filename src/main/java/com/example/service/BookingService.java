package com.example.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.example.entities.Booking;

public interface BookingService {
	public ResponseEntity<?>createBooking(Booking newBooking);
	public String deleteBooking(int bookingid);
	public Iterable<Booking>displayAllBooking();
	public Optional<Booking>findBookingById(int bookingid);
	Booking updateBooking(Booking updatedBooking);
}
