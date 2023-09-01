package com.jsp.Airlines.DTO;

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
public class UserInformation_DTO 
{
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String gender;
	private String userName;
	private String password;
}
