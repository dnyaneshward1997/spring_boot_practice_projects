package com.cdac.service;

import java.util.List;

import com.cdac.model.Songs;

public interface SongsService {

	void add(Songs song);

	void update(Songs song);

	void deleteById(int id);

	Songs getById(int id);

	List<Songs> getAllSongs();
	
	List<Songs> findAllSongsPaginated(int pageNo, int pageSize);

}
