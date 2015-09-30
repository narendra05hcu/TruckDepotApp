package com.truckdepot.common.dao.repository;

import org.springframework.data.repository.CrudRepository;

import com.truckdepot.common.dao.entities.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByEmailId(String emailId);
	

}
