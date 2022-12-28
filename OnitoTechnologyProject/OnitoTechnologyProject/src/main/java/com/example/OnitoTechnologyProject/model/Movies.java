package com.example.OnitoTechnologyProject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Movies {

	@Id
	@Column(name="tconst")
	String tconst;
	
	@Column(name="titletype")
	String titalType;
	
	@Column(name="primarytitle")
	String primaryTitle;
	
	@Column(name="runtimeminutes")
	int runtimeMinutes;
	
	@Column(name="genres")
	String genres;
	
	@OneToOne(cascade =  CascadeType.ALL)
	@JoinColumn(name = "tconst")
	Ratings ratings;
	
	public Movies() {
		super();
	}

	public Movies(String tconst, String titalType, String primaryTitle, int runtimeMinutes, String genres,Ratings ratings) {
		super();
		this.tconst = tconst;
		this.titalType = titalType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
		this.ratings = ratings;
	}

	public Ratings getRating() {
		return ratings;
	}
	
	public void setRating(Ratings ratings) {
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
}
