/**
 * 
 */
package com.movies.moviecatalogueservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.movies.moviecatalogueservice.model.CatalogueItem;
import com.movies.moviecatalogueservice.model.Movie;
import com.movies.moviecatalogueservice.model.Rating;
import com.movies.moviecatalogueservice.model.UserRating;
import com.movies.moviecatalogueservice.service.MovieInfo;
import com.movies.moviecatalogueservice.service.UserRatingInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Rakesh
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieCatalogueController {
	@Autowired
	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private MovieInfo movieInfo;

	@Autowired
	private UserRatingInfo userRatingInfo;

	@RequestMapping("/{userId}")
	public List<CatalogueItem> getCatalog(String userId) {

		UserRating ratings = userRatingInfo.getUserRating(userId);

		return ratings.getUserRating().stream().map(r -> {
			return movieInfo.getCatalogueItem(r);
		}).collect(Collectors.toList());
	}

}
