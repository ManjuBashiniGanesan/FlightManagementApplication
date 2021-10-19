package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;
	private String bookingDate;
	private String Src;
	private String Dest;
	@Enumerated(EnumType.STRING)
	
	private MealType MealType;
	private String DiscountCode;
	private int SeatNoOnward;
	private int SeatNoReturn;
	private String passenger_name;
	private int passenger_contactno;
	private int passenger_age;
	private String passenger_address;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getSrc() {
		return Src;
	}
	public void setSrc(String src) {
		Src = src;
	}
	public String getDest() {
		return Dest;
	}
	public void setDest(String dest) {
		Dest = dest;
	}
	public MealType getMealType() {
		return MealType;
	}
	public void setMealType(MealType mealType) {
		MealType = mealType;
	}
	public String getDiscountCode() {
		return DiscountCode;
	}
	public void setDiscountCode(String discountCode) {
		DiscountCode = discountCode;
	}
	public int getSeatNoOnward() {
		return SeatNoOnward;
	}
	public void setSeatNoOnward(int seatNoOnward) {
		SeatNoOnward = seatNoOnward;
	}
	public int getSeatNoReturn() {
		return SeatNoReturn;
	}
	public void setSeatNoReturn(int seatNoReturn) {
		SeatNoReturn = seatNoReturn;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public int getPassenger_contactno() {
		return passenger_contactno;
	}
	public void setPassenger_contactno(int passenger_contactno) {
		this.passenger_contactno = passenger_contactno;
	}
	public int getPassenger_age() {
		return passenger_age;
	}
	public void setPassenger_age(int passenger_age) {
		this.passenger_age = passenger_age;
	}
	public String getPassenger_address() {
		return passenger_address;
	}
	public void setPassenger_address(String passenger_address) {
		this.passenger_address = passenger_address;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", From=" + Src + ", To=" + Dest
				+ ", MealType=" + MealType + ", DiscountCode=" + DiscountCode + ", SeatNoOnward=" + SeatNoOnward
				+ ", SeatNoReturn=" + SeatNoReturn + ", passenger_name=" + passenger_name + ", passenger_contactno="
				+ passenger_contactno + ", passenger_age=" + passenger_age + ", passenger_address=" + passenger_address
				+ ", gender=" + gender + "]";
	}
	

}
