package com.hackathon.publictransportapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ROUTEDETAILS")
public class RouteDetails {
	
	@Id
	@Column(name="BUS_ID")
	private long busId ;

	@Column(name="Latitude")
	private String latitude;

	@Column(name="Longitude")
	private String longitude;
	
	@Column(name="StartTime")
	private Date startTime;

	@Column(name="EndTime")
	private Date endTime;
	
	@Column(name="ROUTE_ID")
	private long routeId;
	
	public long getRouteId() {
		return routeId;
	}

	public void setRouteId(long routeId) {
		this.routeId = routeId;
	}

	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}



}
