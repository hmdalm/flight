package com.flight.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flight.demo.entity.FlightDetail;

@Repository
public interface FlightDetailRepo extends JpaRepository<FlightDetail, String> {
	
	Optional<FlightDetail> findByFlightId(String flightId);
	
	@Query("SELECT flightId FROM FlightDetail WHERE fligthName = ?1")
	String findAllActiveUsers(String fName);


}
