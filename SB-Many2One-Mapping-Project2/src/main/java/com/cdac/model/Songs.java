package com.cdac.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "songs_table")
public class Songs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String song_name;
	private String song_singers;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id",insertable = false, updatable = false)
	private Album album;

	public Songs() {

	}

	public Songs(int id) {
		super();
		this.id = id;

	}
	
	public Songs(String song_name, String song_singers, Album album) {
		super();
		this.song_name = song_name;
		this.song_singers = song_singers;
		this.album = album;
	}

	public Songs(int id, String song_name, String song_singers, Album album) {
		super();
		this.id = id;
		this.song_name = song_name;
		this.song_singers = song_singers;
		this.album = album;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSong_name() {
		return song_name;
	}

	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public String getSong_singers() {
		return song_singers;
	}

	public void setSong_singers(String song_singers) {
		this.song_singers = song_singers;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return id + "  " + song_name + "  " + song_singers + " " + album;
	}

}
