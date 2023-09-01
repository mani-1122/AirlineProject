package com.jsp.Airlines.services;

import java.util.List;

import com.jsp.Airlines.DTO.Flight_DTO;

public interface Flight_service
{
	int addFlightDetails(Flight_DTO dto);
	
	public List<Flight_DTO> getAllFlights();
}
