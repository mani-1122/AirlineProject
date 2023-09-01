package com.jsp.Airlines.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Airlines.DTO.Inventory_DTO;
import com.jsp.Airlines.entity.Inventory;
import com.jsp.Airlines.repository.Inventory_repository;
@Service
public class Inventory_service_impl implements Inventory_service
{
	@Autowired
	private Inventory_repository inventory_repository;

	@Override
	public int addinventoryDetails(Inventory_DTO dto) 
	{
		
		Inventory inventory = inventory_repository.save(Inventory.
								builder()
								.count(dto.getCount())
								.build());
		return inventory.getInventoryId();
	}

}
