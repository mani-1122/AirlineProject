package com.jsp.Airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.Airline_info_DTO;
import com.jsp.Airlines.entity.Airline_info;
import com.jsp.Airlines.repository.Airline_repository;

@Service
public class Airlnine_sevicer_IMPL implements Airline_service
{
	@Autowired
	Airline_repository airline_repository;

	@Override
	public int addAirlineDetails(Airline_info_DTO dto) 
	{
		Airline_info info = airline_repository
							.save(Airline_info.builder()
							.airlineName(dto.getAirlineName())		
							.build());
		return info.getAirlineId();
		
	}

}
