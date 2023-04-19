package com.cdac.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Album;

@Repository
public interface AlbumDao extends PagingAndSortingRepository<Album, Integer>{

}
