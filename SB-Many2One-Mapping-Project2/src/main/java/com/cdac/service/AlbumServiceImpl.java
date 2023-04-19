package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.AlbumDao;
import com.cdac.model.Album;

@Service
public class AlbumServiceImpl implements AlbumServies {

	@Autowired
	private AlbumDao albumDao;

	@Override
	public void add(Album album) {
		albumDao.save(album);

	}

	@Override
	public void update(Album album) {
		albumDao.save(album);

	}

	@Override
	public void deleteById(int id) {
		albumDao.deleteById(id);

	}

	@Override
	public Album getById(int id) {
		Optional<Album> opt = albumDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Album> getAll() {

		Iterable<Album> itr = albumDao.findAll();
		List<Album> lst = new ArrayList<Album>();
		itr.forEach(ele -> lst.add(ele));

		return lst;
	}

	@Override
	public List<Album> findAllAlbumsPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
