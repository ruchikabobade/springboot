package com.cz.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Integer>{
	//provide all the methods for crud operations
	
	

}
