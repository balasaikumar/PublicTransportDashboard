package com.hackathon.publictransportapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.publictransportapi.Repo.PublicTransportRepo;
import com.hackathon.publictransportapi.entities.Bus;
import com.hackathon.publictransportapi.service.PublicTransportService;


@Service
public class PublicTransportServiceImpl implements PublicTransportService{
	
	@Autowired
	PublicTransportRepo publicTransportRepo;

	 @Override
	 public List<Bus> getPubTransportDetails() throws Exception
	    {
	        List<Bus> pubTransportDetailsList = publicTransportRepo.findAll();
	         
	        if(!pubTransportDetailsList.isEmpty()) {
	            return pubTransportDetailsList;
	        } else {
	            throw new Exception("Invalid User");
	        }
	    }

	
}
