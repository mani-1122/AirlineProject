package com.jsp.Airlines.services;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.Fare_info_DTO;
import com.jsp.Airlines.DTO.Flight_DTO;
import com.jsp.Airlines.DTO.Inventory_DTO;
import com.jsp.Airlines.entity.Flight;
import com.jsp.Airlines.repository.Flight_repository;

@Service
public class Flight_service_impl implements Flight_service
{
	@Autowired
	private Flight_repository flight_repository;
	
	@Override
	public int addFlightDetails(Flight_DTO dto) 
	{
		Flight  flight = flight_repository.
				         save(Flight.builder()
				        .destination(dto.getDestination())
				        .flightDate(dto.getFlightDate())
				        .flightNumber(dto.getFlightNumber())
				        .flightTime(dto.getFlightTime())
				        .currentLocation(dto.getCurrentLocation())
				        .build());
		return flight.getFlightId();
		
	}

	@Override
	public List<Flight_DTO> getAllFlights()
	{
		
		return flight_repository.findAll().stream()
				.map(flightDB -> Flight_DTO		
				.builder().currentLocation(flightDB.getCurrentLocation())
				.destination(flightDB.getDestination())
				.flightTime(flightDB.getFlightTime())
				.flightDate(flightDB.getFlightDate())
				.flightNumber(flightDB.getFlightNumber())
				.fare(Fare_info_DTO.builder().amount(flightDB.getFair_Amount().getAmount())
						.currency(flightDB.getFair_Amount().getCurrency()).build())
				.inventory(Inventory_DTO.builder().count(flightDB.getInventory().getCount()).build())
						build()).collect(Collectors.toList());
				
	}

}
