package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Post;

@Repository
public interface PostDao extends JpaRepository<Post, Integer>{

}
