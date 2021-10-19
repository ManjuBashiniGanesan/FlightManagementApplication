package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Schedule;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule,Integer> {

}
