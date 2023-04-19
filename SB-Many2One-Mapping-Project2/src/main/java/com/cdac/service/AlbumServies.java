package com.cdac.service;

import java.util.List;


import com.cdac.model.Album;

public interface AlbumServies {
	
	void add(Album album);
	
	void update(Album album);
	
	void deleteById(int id);
	
	Album getById(int id);
	
	List<Album> getAll();
	
	List<Album> findAllAlbumsPaginated(int pageNo, int pageSize);

}
