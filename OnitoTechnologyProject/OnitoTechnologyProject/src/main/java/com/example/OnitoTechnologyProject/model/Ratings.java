package com.example.OnitoTechnologyProject.model;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Ratings {

	@Id
	@Column(name="tconst")
	String tconst;

	@Column(name="averagerating")
	double averagerating;

	@Column(name="numvotes")
	int numVotes;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "tconst")
	Movies movies;
	
	public Ratings() {
		super();
	}



	public Ratings(String tconst, double averagerating, int numVotes,Movies movies) {
		super();
		this.tconst = tconst;
		this.averagerating = averagerating;
		this.numVotes = numVotes;
		this.movies = movies;
	}



	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public double getAverageRating() {
		return averagerating;
	}

	public void setAvarageRating(float f) {
		this.averagerating = f;
	}

	public int getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(int numVotes) {
		this.numVotes = numVotes;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}
		
}
	
	
