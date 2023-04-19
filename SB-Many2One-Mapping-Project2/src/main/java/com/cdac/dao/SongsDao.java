package com.cdac.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Songs;


@Repository
public interface SongsDao extends PagingAndSortingRepository<Songs, Integer>{

}
