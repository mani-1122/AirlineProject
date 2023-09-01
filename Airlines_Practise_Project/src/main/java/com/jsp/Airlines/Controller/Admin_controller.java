package com.jsp.Airlines.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Airlines.DTO.Airline_info_DTO;
import com.jsp.Airlines.DTO.Fare_info_DTO;
import com.jsp.Airlines.DTO.Flight_DTO;
import com.jsp.Airlines.DTO.Flight_info_DTO;
import com.jsp.Airlines.DTO.Inventory_DTO;
import com.jsp.Airlines.DTO.UserInformation_DTO;
import com.jsp.Airlines.entity.Airline_info;
import com.jsp.Airlines.services.Airline_service;
import com.jsp.Airlines.services.Fare_service;
import com.jsp.Airlines.services.Flight_info_service;
import com.jsp.Airlines.services.Flight_service;
import com.jsp.Airlines.services.Inventory_service;
import com.jsp.Airlines.services.User_service;

@RestController
@RequestMapping("/api/airline")

public class Admin_controller 
{
	@Autowired
	private User_service user_service ;
	
	@Autowired
	private Airline_service airline_service;
	
	@Autowired
	private Flight_info_service flight_info_service;
	
	@Autowired
	private Fare_service fare_service;
	
	@Autowired
	private Flight_service flight_service;
	
	@Autowired
	private Inventory_service inventory_service;
	
	//create an api to add details in databse
	@PostMapping("/user")
	public ResponseEntity<String> addUserDetails(@RequestBody UserInformation_DTO dto)
	{
		//return airline_service.RegisterUserinformation(dto);
		int id = user_service.RegisterUserinformation(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("id is:"+ id);
	}
	
	
	@PostMapping("/airlineinfo")
	public ResponseEntity<String> addAirlineDetails(@RequestBody Airline_info_DTO dto)
	{
		int id = airline_service.addAirlineDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Airlinr id is :"+ id);
		
	}
	
	@PostMapping("/flightinfo")
	public ResponseEntity<String> addFlightInfo(Flight_info_DTO f_dto)
	{
		int id = flight_info_service.AddFlightInfo(f_dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("flight-info id is :"+id);
		
	}
	
	
	@PostMapping("/fare")
	public ResponseEntity<String> addFairInfo(Fare_info_DTO dto)
	{
		int id =fare_service.addFareDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Fare id is :"+ id);
				
	}
	
	@PostMapping("/flight")
	public ResponseEntity<String> addFlight(Flight_DTO dto)
	{
		int id = flight_service.addFlightDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Flight id is :"+id);
	}
	
	@PostMapping("/inventory")
	public ResponseEntity<String> addInventory(Inventory_DTO dto)
	{
		int id = inventory_service.addinventoryDetails(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Inventory id is :"+id);
	}
	
	
	
	
	
	
}
