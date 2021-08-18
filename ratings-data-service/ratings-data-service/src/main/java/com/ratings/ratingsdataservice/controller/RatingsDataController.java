package com.ratings.ratingsdataservice.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ratings.ratingsdataservice.model.Rating;
import com.ratings.ratingsdataservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class RatingsDataController {
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId,4);
	}
	
	
	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		UserRating ur = new UserRating();
		ur.setUserRating(Arrays.asList(
				new Rating("100", 3),
                new Rating("200", 4)
				));
		return ur;
	}
}
