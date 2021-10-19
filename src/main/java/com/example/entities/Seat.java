package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="seat")

public class Seat {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SEAT_TYPE_ID")
    private int id;
	private int seat_type;
	@Enumerated(EnumType.STRING)
	private Couch coach;
	private int availableseats;
	@OneToOne
	private Flight flight;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeat_type() {
		return seat_type;
	}
	public void setSeat_type(int seat_type) {
		this.seat_type = seat_type;
	}
	public Couch getCoach() {
		return coach;
	}
	public void setCoach(Couch coach) {
		this.coach = coach;
	}
	public int getAvailableseats() {
		return availableseats;
	}
	public void setAvailableseats(int availableseats) {
		this.availableseats = availableseats;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Seat [id=" + id + ", seat_type=" + seat_type + ", coach=" + coach + ", availableseats=" + availableseats
				+ ", flight=" + flight + "]";
	}
	
}
