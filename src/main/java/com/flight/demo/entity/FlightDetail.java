package com.flight.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "flight_detail")
public class FlightDetail {
	
	@Column(name = "flight_id")
	@Id
	private String flightId;
	
	@Column(name = "fligth_name")
	private String fligthName;
	
	
	

	public FlightDetail() {
		super();
	}

	public FlightDetail(String flightId, String fligthName) {
		super();
		this.flightId = flightId;
		this.fligthName = fligthName;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFligthName() {
		return fligthName;
	}

	public void setFligthName(String fligthName) {
		this.fligthName = fligthName;
	}

	

}
