package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ScheduleFlightRepository;
import com.example.dao.ScheduleRepository;
import com.example.entities.Schedule;
import com.example.entities.ScheduleFlight;
@Service
public class ScheduleFlightServiceImpl implements ScheduleFlightService {
	/*
	 * Creating DAO object
	 */
	@Autowired
	ScheduleFlightRepository dao;

	@Autowired
	ScheduleRepository scheduleDao;

	@Autowired
	BookingService bookingService;

	/*
	 * Service method to add new Scheduled flight to database
	 */
	@Override
	public ScheduleFlight addScheduledFlight(ScheduleFlight scheduledFlight) {
		return dao.save(scheduledFlight);
	}

	/*
	 * Service method to modify existing Scheduled flight in database
	 */
	@Override
	public ScheduleFlight modifyScheduledFlight(ScheduleFlight scheduleFlight) {
		ScheduleFlight updateScheduleFlight = dao.findById(scheduleFlight.getScheduleFlightId()).get();
		Schedule updateSchedule = scheduleDao.findById(scheduleFlight.getSchedule().getScheduleId()).get();
		updateScheduleFlight.setAvailableSeats(scheduleFlight.getAvailableSeats());
		updateSchedule.setArrDateTime(scheduleFlight.getSchedule().getArrDateTime());
		updateSchedule.setDeptDateTime(scheduleFlight.getSchedule().getDeptDateTime());
		dao.save(updateScheduleFlight);
		return scheduleFlight;
	}

	/*
	 * Service method to remove existing Scheduled flight from database
	 */
	@Override
	public String removeScheduledFlight(int flightId)  {
		 dao.deleteById(flightId);
		 return "Deleted successfully";
		}

	
	/*
	 * Service method to view all Scheduled flights in database
	 */
	@Override
	public Iterable<ScheduleFlight> viewAllScheduledFlights() {
		return dao.findAll();
	}

	/*
	 * Service method to view a Scheduled flight by ID from database
	 */
	@Override
	public Optional<ScheduleFlight> viewScheduledFlight(int flightId)  {
		return dao.findById(flightId);
		
			}

	
			}
