package com.jsp.Airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Airlines.entity.Flight_info;

public interface Flight_info_repository extends JpaRepository<Flight_info, Integer>
{

}
