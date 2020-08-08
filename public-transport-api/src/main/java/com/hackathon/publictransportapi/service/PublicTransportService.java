package com.hackathon.publictransportapi.service;

import java.util.List;

import com.hackathon.publictransportapi.entities.Bus;

public interface PublicTransportService {

	public List<Bus> getPubTransportDetails() throws Exception;
}
