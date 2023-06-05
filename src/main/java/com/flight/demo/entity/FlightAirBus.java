package com.flight.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class FlightAirBus {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_air_bus_seq")
	@SequenceGenerator(sequenceName = "flight_air_bus_seq", allocationSize = 1, name = "flight_air_bus_seq")
	@Column(name = "air_id")
	private Integer airId;
	@Column(name = "flight_id")
	private String flightId;
	@Column(name="flight_number")
	private String flightNumber;
	
	public FlightAirBus() {
		super();
	}
	public FlightAirBus(Integer airId, String flightId, String flightNumber) {
		super();
		this.airId = airId;
		this.flightId = flightId;
		this.flightNumber = flightNumber;
	}
	public Integer getAirId() {
		return airId;
	}
	public void setAirId(Integer airId) {
		this.airId = airId;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	

}
