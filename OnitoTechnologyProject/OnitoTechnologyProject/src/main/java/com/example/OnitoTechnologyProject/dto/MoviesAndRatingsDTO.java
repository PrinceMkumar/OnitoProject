package com.example.OnitoTechnologyProject.dto;

import com.example.OnitoTechnologyProject.model.Ratings;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;

public class MoviesAndRatingsDTO {

	String tconst;
	String titalType;
	String primaryTitle;
	int runtimeMinutes;
	String genres;
	Ratings ratings;
	
	
	public MoviesAndRatingsDTO() {
		super();
	}
	
	public MoviesAndRatingsDTO(String tconst, String titalType, String primaryTitle, int runtimeMinutes, String genres,
			Ratings ratings) {
		super();
		this.tconst = tconst;
		this.titalType = titalType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
		this.ratings = ratings;
	}
	public String getTconst() {
		return tconst;
	}
	public void setTconst(String tconst) {
		this.tconst = tconst;
	}
	public String getTitalType() {
		return titalType;
	}
	public void setTitalType(String titalType) {
		this.titalType = titalType;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}
	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public Ratings getRatings() {
		return ratings;
	}
	public void setRatings(Ratings ratings) {
		this.ratings = ratings;
	}
	
	
}
