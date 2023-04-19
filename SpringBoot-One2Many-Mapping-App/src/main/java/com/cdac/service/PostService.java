package com.cdac.service;

import java.util.List;
import com.cdac.model.Post;

public interface PostService {
	
	void add(Post post);

	void modify(Post post);

	void remove_By_Id(int id);

	Post get_By_Id(int id);

	List<Post> get_All();
	
}