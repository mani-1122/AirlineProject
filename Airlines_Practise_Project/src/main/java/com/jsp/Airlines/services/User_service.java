package com.jsp.Airlines.services;

import com.jsp.Airlines.DTO.UserInformation_DTO;

public interface User_service
{
	int RegisterUserinformation(UserInformation_DTO dto);
	void RegisterPassengers();
	void AddFlights();
	void BookFlight();
	void getBookingDetailsById();
	void getAllBookingDetails();
	
}
