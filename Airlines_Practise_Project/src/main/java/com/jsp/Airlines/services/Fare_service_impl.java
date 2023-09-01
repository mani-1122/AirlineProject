package com.jsp.Airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.Fare_info_DTO;
import com.jsp.Airlines.entity.Fare_Amount;
import com.jsp.Airlines.repository.Fare_repository;

@Service
public class Fare_service_impl implements Fare_service
{
	@Autowired
	private Fare_repository repository;

	@Override
	public int addFareDetails(Fare_info_DTO dto) 
	{
		Fare_Amount fare_Amount = repository
				                  .save(Fare_Amount.builder()
				                  .currency(dto.getCurrency())
				                  .amount(dto.getAmount())				                  
				                  .build());
		return fare_Amount.getFairId();
		
	}


}
