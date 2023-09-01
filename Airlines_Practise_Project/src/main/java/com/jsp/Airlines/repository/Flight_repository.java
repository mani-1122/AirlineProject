package com.jsp.Airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Airlines.entity.Flight;

public interface Flight_repository extends JpaRepository<Flight, Integer>
{

}
