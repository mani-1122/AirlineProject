package com.jsp.Airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.UserInformation_DTO;
import com.jsp.Airlines.entity.User_info;
import com.jsp.Airlines.repository.User_Repository;

@Service
public class User_service_Impl implements User_service
{
	
	@Autowired
	private User_Repository user_Repository;
	
	@Override
	public int RegisterUserinformation(UserInformation_DTO dto)
	{
		
		User_info user = user_Repository
						.save(User_info.builder()
						.firstName(dto.getFirstName())
						.lastName(dto.getLastName())
						.mobileNo(dto.getMobileNo())
						.gender(dto.getGender())
						.userName(dto.getUserName())
						.password(dto.getPassword())
						.build());
	
		return user.getUserId();
	}

	@Override
	public void RegisterPassengers()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddFlights()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BookFlight()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBookingDetailsById() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllBookingDetails() 
	{
		// TODO Auto-generated method stub
		
	}
	
}
