package com.rental.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="MOVIE")
public class Movie {
	@Id
	@Column(name="ID", length = 19)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

    @Column(name="TITLE", length=100)
    private String title;
    
    @Column(name="GENRE", length=100)
    private String genre;

    @Column(name="RATING")
	private Integer rating = 1;

    @Column(name="FILM_RATING", length=3)
    private String filmRating;
    
    @Column(name="ACTOR", columnDefinition = "text")
    private String actor;
    
    @Column(name="ACTRESS", columnDefinition = "text")
    private String actress;
    
    @Column(name="DIRECTOR", columnDefinition = "text")
    private String director;
    
    @Column(name="AUDIO_FORMAT", length=100)
    private String audioFormat;

    @Column(name="RUN_TIME")
    private Long runTime;
    
    @Column(name="SYNOPSIS", columnDefinition = "text")
    private String synopsis;
    
    @Column(name="COUNTRY", length=20)
    private String country;
    
    @Column(name="RELEASE_YEAR")
	private Integer releaseYear = 1900;
	
	@Column(name="CREATE_BY", length=20)
	private String createBy;
	
	@Column(name="CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="LAST_UPDATE_BY", length=20)
	private String lastUpdateBy;

	@Version
	@Column(name="LAST_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
	@ForeignKey(name = "none")
	private List<MovieItem> movieItems = new ArrayList<MovieItem>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getFilmRating() {
		return filmRating;
	}

	public void setFilmRating(String filmRating) {
		this.filmRating = filmRating;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActress() {
		return actress;
	}

	public void setActress(String actress) {
		this.actress = actress;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getAudioFormat() {
		return audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
	}

	public Long getRunTime() {
		return runTime;
	}

	public void setRunTime(Long runTime) {
		this.runTime = runTime;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public List<MovieItem> getMovieItems() {
		return movieItems;
	}

	public void setMovieItems(List<MovieItem> movieItems) {
		this.movieItems = movieItems;
	}
}
