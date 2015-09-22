package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmailId(String emailId);
	

}
