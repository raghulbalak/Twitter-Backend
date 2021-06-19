package com.tweetapp.tweet.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tweetapp.tweet.model.Tweet;

public interface TweetsRepository extends MongoRepository<Tweet, String> {
	
	List<Tweet> findAll();
	
	List<Tweet> findByEmailId(String emailId);

}
