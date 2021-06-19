package com.tweetapp.tweet.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.tweet.model.Register;

public interface LoginRepository extends MongoRepository<Register, String> {
	
	Register findByUserId(String userId);
	
	Register findByEmailId(String emailId);

}
