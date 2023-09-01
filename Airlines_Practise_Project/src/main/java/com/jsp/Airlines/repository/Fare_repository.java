package com.jsp.Airlines.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Airlines.entity.Fare_Amount;

public interface Fare_repository extends JpaRepository<Fare_Amount, Integer>
{

}
