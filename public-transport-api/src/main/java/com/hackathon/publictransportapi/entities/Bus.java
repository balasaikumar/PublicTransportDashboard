package com.hackathon.publictransportapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="BUS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bus {

	@Id
	@Column(name="busId")
	private long busId;

	@Column(name="busNumber")
	private String busNumber;

	@Column(name="capacity")
	private Integer capacity;

	@Column(name="fuelConsumption")
	private Integer fuelConsumption;

	@Column(name="currentPassengerCount")
	private Integer currentPassengerCount;
	
	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Integer getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Integer fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public Integer getCurrentPassengerCount() {
		return currentPassengerCount;
	}

	public void setCurrentPassengerCount(Integer currentPassengerCount) {
		this.currentPassengerCount = currentPassengerCount;
	}

	
	
}
