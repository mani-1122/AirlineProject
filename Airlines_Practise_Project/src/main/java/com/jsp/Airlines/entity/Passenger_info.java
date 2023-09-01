package com.jsp.Airlines.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name ="passenger_information")
public class Passenger_info 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passengerId;
	private String email;
	private String firstName;
	private String lasstName;
	private String gender;
	private int mobileNo;
	

	// to represent bookingInfo fk in passengerInfo
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "booking_id")
	private Booking_info booking_info;
	
	// to reprsent checkingInfo fk in passengerInfo
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "checking_id")
	private Checking_info checking_info;
}
