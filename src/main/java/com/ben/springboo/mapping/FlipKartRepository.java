package com.ben.springboo.mapping;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ben.springboo.model.User;

public interface FlipKartRepository extends MongoRepository<User, Integer> {

	List<User> findByName(String name);
	
	@Query("{'Address.city':?0}")
	List<User> findBYCity(String city);

}
