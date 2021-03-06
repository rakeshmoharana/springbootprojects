package com.movies.moviecatalogueservice.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movies.moviecatalogueservice.model.Rating;
import com.movies.moviecatalogueservice.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserRatingInfo {
	
	@Autowired
	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;
	
	
	@HystrixCommand(fallbackMethod = "getFallBackUserRatingItem")
	public UserRating getUserRating(String userId) {
		return restTemplate.getForObject("http://ratings-data-service/ratings/users/h", UserRating.class);
	}
	
	public UserRating getFallBackUserRatingItem(String userId) {
		UserRating r =  new UserRating();
		r.setUserId(userId);
		r.setUserRating(Arrays.asList(new Rating("NO Movie", 0)));
		return r;
	}
	
}
