package com.example.OnitoTechnologyProject.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.OnitoTechnologyProject.model.Movies;

import jakarta.persistence.PersistenceContext;

@Repository
public interface MoviesRepo extends JpaRepository<Movies, String>{

	
	@Query(value="select * from Movies where tconst= ?1",nativeQuery=true)
	Movies findByAvarageRatings(@Param(value = "tconst") String tconst);
	
	@Query(value="select * from Movies order by runtimeminutes desc limit 10",nativeQuery=true)
	List<Movies> findAllMovies();	

}
