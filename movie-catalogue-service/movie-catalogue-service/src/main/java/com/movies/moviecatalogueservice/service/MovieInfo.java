package com.movies.moviecatalogueservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.movies.moviecatalogueservice.model.CatalogueItem;
import com.movies.moviecatalogueservice.model.Movie;
import com.movies.moviecatalogueservice.model.Rating;
import com.movies.moviecatalogueservice.model.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@Service
public class MovieInfo {
	@Autowired
//	@Qualifier("getRestTemplate")
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	
	@HystrixCommand(fallbackMethod = "getFallBackCatalogItem")
	public CatalogueItem getCatalogueItem(Rating r) {
		Movie m = restTemplate.getForObject("http://movie-info-service/movies/"+r.getMovieId(), Movie.class);
		return new CatalogueItem(m.getMovieId(),m.getDescription(),r.getRating());
	}
	
	public CatalogueItem getFallBackCatalogItem(Rating r) {
//		Movie m = restTemplate.getForObject("http://movie-info-service/movies/"+r.getMovieId(), Movie.class);
		return new CatalogueItem("No Movie","No Description Found",r.getRating());
	}
}
