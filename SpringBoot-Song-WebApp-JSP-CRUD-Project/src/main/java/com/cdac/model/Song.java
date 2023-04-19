package com.cdac.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "song_table2")
public class Song {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String songName;
	private String singerName;
	private String movieName;
	private Date releseDate;

	public Song() {
		super();
	}

	public Song(int id) {
		super();
		this.id = id;

	}

	public Song(String user, String songName, String singerName, String movieName, Date releseDate) {
		super();
		this.userName = user;
		this.songName = songName;
		this.singerName = singerName;
		this.movieName = movieName;
		this.releseDate = releseDate;
	}

	public Song(int id, String user, String songName, String singerName, String movieName, Date releseDate) {
		super();
		this.id = id;
		this.userName = user;
		this.songName = songName;
		this.singerName = singerName;
		this.movieName = movieName;
		this.releseDate = releseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public Date getReleseDate() {
		return releseDate;
	}

	public void setReleseDate(Date releseDate) {
		this.releseDate = releseDate;
	}

	

}
