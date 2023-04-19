package com.cdac.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Comment;

@Repository
public interface CommentDao extends JpaRepository<Comment, Integer>{

}
