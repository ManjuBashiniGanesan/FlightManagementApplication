package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")

public class Ticket {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketid;
	private double amount;
	@OneToOne
	private Seat seat;
	@OneToOne
	private Booking booking;
	@OneToOne
	private Flight flight;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Booking getBooking() {
		return booking;
	}
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", amount=" + amount + ", seat=" + seat + ", booking=" + booking
				+ ", flight=" + flight + "]";
	}
	
    

}
