package com.hackathon.publictransportapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.publictransportapi.entities.Bus;
import com.hackathon.publictransportapi.service.PublicTransportService;


@RestController
@RequestMapping("/api/v1")
public class PublicTransportController {
	
	@Autowired
	PublicTransportService publicTransportService;
		
	@GetMapping("/getPubTransportDetails")
    public ResponseEntity<List<Bus>> getPubTransportDetails() throws Exception {
		List<Bus> pubTransportDetails = publicTransportService.getPubTransportDetails(); 
        return new ResponseEntity<>(pubTransportDetails, HttpStatus.OK);
    }

}
