package com.tweetapp.tweet.model;

import java.sql.Date;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Tweet {
	@Id
	private String id;
	
	private String emailId;
	private String tweet;
	private String postedDate;
	private List<Reply> replies;
	private List<Like> likes;
	public Tweet(String id, String tweet, String postedDate, List<Reply> replies, List<Like> likes,  String emailId) {
		super();
		this.id = id;
		this.tweet = tweet;
		this.postedDate = postedDate;
		this.replies = replies;
		this.likes = likes;
		this.emailId = emailId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<Reply> getReplies() {
		return replies;
	}
	public void setReplies(List<Reply> replies) {
		this.replies = replies;
	}
	public List<Like> getLikes() {
		return likes;
	}
	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public String getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(String postedDate) {
		this.postedDate = postedDate;
	}
	
	public Tweet() {
		super();
	}
	
	

}
