package com.hackathon.publictransportapi.entities;

@Entity(name="BUS")
public class Bus {

	@Id
	@Column(name="BUS_ID")
	private long busId;

	@Column(name="BusNumber")
	private String busNumber;

	@Column(name="Capacity")
	private Integer capacity;

	@Column(name="CurrentPassengerCount")
	private Integer currentPassengerCount;

	@Column(name="FuelConsumption")
	private Double fuelConsumption;

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

	public Integer getCurrentPassengerCount() {
		return currentPassengerCount;
	}

	public void setCurrentPassengerCount(Integer currentPassengerCount) {
		this.currentPassengerCount = currentPassengerCount;
	}

	public Double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(Double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	
}
