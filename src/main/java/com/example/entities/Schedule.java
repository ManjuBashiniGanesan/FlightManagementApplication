package com.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "schedule")

public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "schedule_Id")
	private int scheduleId;

	@OneToOne(fetch = FetchType.EAGER)
	private Airline Airline;

	

	@Column(name = "departure_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private String deptDateTime;

	@Column(name = "arrival_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
	private String arrDateTime;

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int bigInteger) {
		this.scheduleId = bigInteger;
	}

	public Airline getAirline() {
		return Airline;
	}

	public void setAirline(Airline airline) {
		Airline = airline;
	}

	public String getDeptDateTime() {
		return deptDateTime;
	}

	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}

	public String getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleId=" + scheduleId + ", Airline=" + Airline + ", deptDateTime=" + deptDateTime
				+ ", arrDateTime=" + arrDateTime + "]";
	}
	
}
