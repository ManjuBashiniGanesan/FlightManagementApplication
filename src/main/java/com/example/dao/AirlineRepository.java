package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Airline;
@Repository
public interface AirlineRepository extends JpaRepository<Airline,Integer> {

}
