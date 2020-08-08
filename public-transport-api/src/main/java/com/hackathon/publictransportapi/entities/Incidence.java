package com.hackathon.publictransportapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="INCIDENCE")
public class Incidence {

	@Id
	@Column(name="INCIDENT_ID")
	private long maintenanceId;

	@Column(name="BUS_ID")
	private long busId ;

	@Column(name="IncidentMessage")
	private String incidentMessage;

	@Column(name="LastIncident")
	private Date lastIncident;
	

	public long getMaintenanceId() {
		return maintenanceId;
	}

	public void setMaintenanceId(long maintenanceId) {
		this.maintenanceId = maintenanceId;
	}

	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public String getIncidentMessage() {
		return incidentMessage;
	}

	public void setIncidentMessage(String incidentMessage) {
		this.incidentMessage = incidentMessage;
	}

	public Date getLastIncident() {
		return lastIncident;
	}

	public void setLastIncident(Date lastIncident) {
		this.lastIncident = lastIncident;
	}


	
}
