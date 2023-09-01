package com.jsp.Airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Airlines.entity.User_info;

public interface User_Repository extends JpaRepository<User_info, Integer> 
{

}
