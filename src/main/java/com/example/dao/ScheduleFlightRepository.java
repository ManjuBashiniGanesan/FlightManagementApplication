package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ScheduleFlight;
@Repository
public interface ScheduleFlightRepository extends JpaRepository<ScheduleFlight,Integer> {

}
