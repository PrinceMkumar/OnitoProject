package com.example.OnitoTechnologyProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.OnitoTechnologyProject.dto.MoviesAndRatingsDTO;
import com.example.OnitoTechnologyProject.model.Movies;
import com.example.OnitoTechnologyProject.model.Ratings;
import com.example.OnitoTechnologyProject.repository.MoviesRepo;
import com.example.OnitoTechnologyProject.repository.RatingsRepo;

import java.util.*;
@RestController
@RequestMapping("/api")
public class RequestControllers {

	@Autowired
	MoviesRepo moviesRepo;
	
	@Autowired
	RatingsRepo ratingsRepo;
	
	@GetMapping("/v1/longest-duration-movies")
	public ResponseEntity<List<Movies>> getLongestDurationMovies(){
		List<Movies> m = moviesRepo.findAllMovies();
		return new ResponseEntity<List<Movies>>(m,HttpStatus.OK);
	}
	
	@PostMapping("/v1/new-movie")
	public ResponseEntity<String> saveNewMovies(@RequestBody MoviesAndRatingsDTO movies){
		Movies m= new Movies();
		m.setGenres(movies.getGenres());
		m.setPrimaryTitle(movies.getPrimaryTitle());
		m.setRating(movies.getRatings());
		m.setRuntimeMinutes(movies.getRuntimeMinutes());
		m.setTconst(movies.getTconst());
		m.setTitalType(movies.getTitalType());
		moviesRepo.save(m);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
		
	}
	
	@GetMapping("/v1/top-rated-movies")
	public ResponseEntity<List<Movies>> getAverageRating(){
		List<Ratings> r=ratingsRepo.findAll();
		List<Movies> s1= new ArrayList<Movies>();
		for (int i = 0; i < r.size(); i++) {
		   if(r.get(i).getAverageRating()>6) {
			Optional<Movies> m= moviesRepo.findById(r.get(i).getTconst());
			//m.orElseThrow(Exception::new);
			System.out.println(m.get());
			   s1.add(m.get());
		   }		
		}
		return new ResponseEntity<List<Movies>>(s1,HttpStatus.OK);
	}
}
