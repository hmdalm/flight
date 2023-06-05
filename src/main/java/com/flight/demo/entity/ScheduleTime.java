package com.flight.demo.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="schedul_time")
public class ScheduleTime {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "flight_air_bus_seq")
	@SequenceGenerator(sequenceName = "flight_air_bus_seq", allocationSize = 1, name = "flight_air_bus_seq")
	@Column(name = "air_id")
	private String airId;
	@Column(name="fligth_name")
	private String fligthName;
	@Column(name="flight_number")
	private String flightNumber;
	@Column(name="depart")
	private Date depart;
	@Column(name="arrival")
	private Date arrival;
	public String getAirId() {
		return airId;
	}
	public void setAirId(String airId) {
		this.airId = airId;
	}
	public String getFligthName() {
		return fligthName;
	}
	public void setFligthName(String fligthName) {
		this.fligthName = fligthName;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Date getDepart() {
		return depart;
	}
	public void setDepart(Date depart) {
		this.depart = depart;
	}
	public Date getArrival() {
		return arrival;
	}
	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	
	

}
