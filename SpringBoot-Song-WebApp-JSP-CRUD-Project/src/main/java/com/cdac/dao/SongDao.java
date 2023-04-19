package com.cdac.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Song;


@Repository
public interface SongDao extends JpaRepository<Song, Integer>{
	
	List<Song> getSongsByMovieName(String movieName	);
	
	List<Song> getSongsBySingerName(String singerName);
	
	List<Song> getSongsByUserName(String userName);

}
