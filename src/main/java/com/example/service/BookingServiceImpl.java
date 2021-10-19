package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dao.BookingRepository;
import com.example.entities.Booking;
import com.example.exception.RecordAlreadyPresentException;
import com.example.exception.RecordNotFoundException;
@Service
public class BookingServiceImpl implements BookingService{
	/*
	 * Creating DAO object
	 */
	@Autowired
	BookingRepository bookingrepo;

	/*
	 * creating new Booking
	 */
	@Override
	public ResponseEntity<Booking> createBooking(Booking newBooking) {

		Optional<Booking> findBookingById = bookingrepo.findById(newBooking.getBookingId());
		try {
			if (!findBookingById.isPresent()) {
				bookingrepo.save(newBooking);
				return new ResponseEntity<Booking>(newBooking, HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException(
						"Booking with Booking Id: " + newBooking.getBookingId() + " already exists!!");
		} catch (RecordAlreadyPresentException e) {

			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/*
	 * update booking made
	 */
	
	@Override
	public Booking updateBooking(Booking updatedBooking) {
		Optional<Booking> findBookingById = bookingrepo.findById(updatedBooking.getBookingId());
		if (findBookingById.isPresent()) {
			bookingrepo.save(updatedBooking);
		} else
			throw new RecordNotFoundException(
					"Booking with Booking Id: " + updatedBooking.getBookingId() + " not exists!!");
		return updatedBooking;
	}

	/*
	 * deleteing the booking
	 */

	@Override
	public String deleteBooking(int bookingId) {

		Optional<Booking> findBookingById = bookingrepo.findById(bookingId);
		if (findBookingById.isPresent()) {
			bookingrepo.deleteById(bookingId);
			return "Booking Deleted!!";
		} else
			throw new RecordNotFoundException("Booking not found for the entered BookingID");
	}

	/*
	 * 
	 * 
	 * @see com.org.service.BookingService#displayAllBooking() show all booking
	 */
	@Override
	public Iterable<Booking> displayAllBooking() {

		return bookingrepo.findAll();
	}

	/*
	 * 
	 * 
	 * @see com.org.service.BookingService#findBookingById(java.math.BigInteger)
	 * find booking by ID
	 */
	@Override
	public Optional<Booking> findBookingById(int bookingId) {
		return bookingrepo.findById(bookingId);
	
}
}
