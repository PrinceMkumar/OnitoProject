package com.example.OnitoTechnologyProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.OnitoTechnologyProject.model.Movies;
import com.example.OnitoTechnologyProject.model.Ratings;

@Repository
public interface RatingsRepo extends JpaRepository<Ratings, String>{

	
	List<Ratings> findAll();
}
