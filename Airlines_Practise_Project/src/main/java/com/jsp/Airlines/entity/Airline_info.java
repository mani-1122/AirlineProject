package com.jsp.Airlines.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
@Entity
@Table(name = "airline_information")
public class Airline_info 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airlineId;
	private String airlineName;
	
   @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "airline_info")
   private List<Flight_info> flight_info;
}
