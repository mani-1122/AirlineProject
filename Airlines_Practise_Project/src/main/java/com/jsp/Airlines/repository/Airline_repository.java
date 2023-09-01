package com.jsp.Airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Airlines.entity.Airline_info;

public interface Airline_repository extends JpaRepository<Airline_info, Integer>
{

}
