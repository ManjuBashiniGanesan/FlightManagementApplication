package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Seat;
@Repository
public interface SeatRepository extends JpaRepository<Seat,Integer> {

}
