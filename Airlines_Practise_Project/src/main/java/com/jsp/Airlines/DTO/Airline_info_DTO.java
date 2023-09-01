package com.jsp.Airlines.DTO;

import java.util.List;

import com.jsp.Airlines.entity.Flight_info;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Airline_info_DTO 
{
	private String airlineName;
	
//	private List<Flight_info> flight_info;
}
