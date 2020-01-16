package com.radioService.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.radioService.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
	public CustomerEntity  findByfName(String fName);
	

}
