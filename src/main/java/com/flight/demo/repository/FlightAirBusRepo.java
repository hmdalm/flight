package com.flight.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flight.demo.entity.FlightAirBus;

@Repository
public interface FlightAirBusRepo extends JpaRepository<FlightAirBus, Integer> {
	Optional<FlightAirBus> findByFlightId(String flightId);

	@Query("SELECT flightId FROM FlightAirBus WHERE flightNumber =?1")
	String findAllActiveUsers(String fNumber);
}
