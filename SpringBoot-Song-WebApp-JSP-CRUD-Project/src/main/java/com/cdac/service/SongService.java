package com.cdac.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.cdac.model.Song;


public interface SongService {

	void add(Song song);
	
	 List <Song> getSongsByUserName(String userName);
	
	void update(Song song);

	void deleteById(int id);

	 Optional < Song > getById(int id);

	List<Song> getAll();

	void addSong(String userName, String songName, String singerName, String movieName, Date releseDate);

	List<Song> getSongsBySingerName(String singerName);
	
	List<Song> getSongsByMovieName(String movieName	);



}
