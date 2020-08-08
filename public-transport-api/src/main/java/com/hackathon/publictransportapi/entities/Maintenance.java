package com.hackathon.publictransportapi.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="MAINTENANCE")
public class Maintenance {

	@Id
	@Column(name="MAINTENANCE_ID")
	private long maintenanceId;

	@Column(name="BUS_ID")
	private long busId ;

	@Column(name="MaintananceTime")
	private Date timeoMaintenance;

	@Column(name="LastMaintanace")
	private Date lastMaintenance;

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

	public Date getTimeoMaintenance() {
		return timeoMaintenance;
	}

	public void setTimeoMaintenance(Date timeoMaintenance) {
		this.timeoMaintenance = timeoMaintenance;
	}

	public Date getLastMaintenance() {
		return lastMaintenance;
	}

	public void setLastMaintenance(Date lastMaintenance) {
		this.lastMaintenance = lastMaintenance;
	}

	
	
}
