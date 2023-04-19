package com.cdac.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cdac.dao.SongsDao;

import com.cdac.model.Songs;

@Service
public class SongsServiceImpl implements SongsService {

	@Autowired
	private SongsDao songsDao;

	@Override
	public void add(Songs song) {
		songsDao.save(song);

	}

	@Override
	public void update(Songs song) {
		songsDao.save(song);

	}

	@Override
	public void deleteById(int id) {
		songsDao.deleteById(id);

	}

	@Override
	public Songs getById(int id) {
		Optional<Songs> opt = songsDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Songs> getAllSongs() {
		Iterable<Songs> itr = songsDao.findAll();
		List<Songs> lst = new ArrayList<Songs>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

	@Override
	public List<Songs> findAllSongsPaginated(int pageNo, int pageSize) {
		Pageable p = PageRequest.of(pageNo, pageSize);
		Page<Songs> pageResult = songsDao.findAll(p);

		return pageResult.toList();
	}

}
