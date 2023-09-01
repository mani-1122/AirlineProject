package com.jsp.Airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.Flight_info_DTO;
import com.jsp.Airlines.entity.Flight_info;
import com.jsp.Airlines.repository.Flight_info_repository;
@Service
public class Flight_Info_service_impl implements Flight_info_service
{
	@Autowired
	Flight_info_repository flight_info_repository;

	@Override
	public int AddFlightInfo(Flight_info_DTO dto)
	{
		
		Flight_info flight_info = flight_info_repository
									.save(Flight_info.builder()
									.flightNo(dto.getFlightNo())
									.flighttime(dto.getFlighttime())
									.flightType(dto.getFlightType())
									.build());
		return flight_info.getFlightInfoId();
	}

}
