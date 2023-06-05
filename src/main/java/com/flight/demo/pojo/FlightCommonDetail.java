package com.flight.demo.pojo;

import java.sql.Date;

public class FlightCommonDetail {
	private String flightId;
	private String flightName;
    private String flightNumber;	
    private Date depart;
    private Date arrival;
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
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
