package com.cdac.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.SongDao;
import com.cdac.model.Song;

@Service
public class SongServiceImpl implements SongService {

	@Autowired
	private SongDao songDao;

	@Override
	public void add(Song song) {
		songDao.save(song);

	}

	@Override
	public void addSong(String userName, String songName, String singerName, String movieName, Date releseDate) {
		songDao.save(new Song(userName, songName, singerName, movieName, releseDate));

	}

	@Override
	public void update(Song song) {
		songDao.save(song);

	}

	@Override
	public void deleteById(int id) {
		songDao.deleteById(id);

	}

	@Override
	public Optional<Song> getById(int id) {

		

		return songDao.findById(id);
	}

	@Override
	public List<Song> getAll() {

		Iterable<Song> itr = songDao.findAll();

		List<Song> songList = new ArrayList<Song>();
		itr.forEach(element -> songList.add(element));

		return songList;
	}

	@Override
	public List<Song> getSongsByUserName(String userName) {

		return songDao.getSongsByUserName(userName);
	}

	@Override
	public List<Song> getSongsBySingerName(String singerName) {

		return songDao.getSongsBySingerName(singerName);
	}

	@Override
	public List<Song> getSongsByMovieName(String movieName) {

		return songDao.getSongsByMovieName(movieName);
	}

}
