package com.movies.moviecatalogueservice.model;

import java.util.List;

public class UserRating {
	private List<Rating> userRating;
private String userId;
	/**
 * @return the userId
 */
public String getUserId() {
	return userId;
}

/**
 * @param userId the userId to set
 */
public void setUserId(String userId) {
	this.userId = userId;
}

	public UserRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Rating> userRating) {
		super();
		this.userRating = userRating;
	}

	/**
	 * @return the userRating
	 */
	public List<Rating> getUserRating() {
		return userRating;
	}

	/**
	 * @param userRating the userRating to set
	 */
	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
}
