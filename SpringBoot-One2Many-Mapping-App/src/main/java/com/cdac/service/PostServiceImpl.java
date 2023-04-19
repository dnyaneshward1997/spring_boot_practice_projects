package com.cdac.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cdac.dao.PostDao;
import com.cdac.model.Post;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao postDao;

	@Override
	public void add(Post post) {
		postDao.save(post);

	}



	@Override
	public void modify(Post post) {
		postDao.save(post);

	}

	@Override
	public void remove_By_Id(int id) {
		postDao.deleteById(id);

	}

	@Override
	public Post get_By_Id(int id) {
		Optional<Post> opt = postDao.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	public List<Post> get_All() {
		Iterable<Post> itr = postDao.findAll();
		List<Post> lst = new ArrayList<Post>();
		itr.forEach(ele -> lst.add(ele));
		return lst;
	}

}