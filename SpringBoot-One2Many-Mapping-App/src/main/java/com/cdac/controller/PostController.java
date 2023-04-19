package com.cdac.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.model.Post;
import com.cdac.service.PostService;

@RestController
public class PostController {
	@Autowired
	private PostService postService;

	@PostMapping(value = { "/post" })
	public String add_Post(@RequestBody Post post) {
		postService.add(post);
		return "Post added successfully";
	}

	@PutMapping(value = { "/post" })
	public String update_Post(@RequestBody Post post) {
		postService.modify(post);
		return "Post updated successfully";
	}

	@DeleteMapping(value = { "/post" })
	public String delete_Post(@RequestParam int id) {
		System.out.println("first delete");
		postService.remove_By_Id(id);
		return "Post deleted successfully";
	}

	@DeleteMapping(value = { "/post/{id}" })
	public String delete_Post1(@PathVariable int id) {
		System.out.println("second delete");
		postService.remove_By_Id(id);
		return "Post deleted successfully";
	}

	@GetMapping(value = { "/post/{id}" })
	public Post get_Post_By_Id(@PathVariable int id) {
		return postService.get_By_Id(id);
	}

	@GetMapping(value = { "/post" })
	public List<Post> get_All_Posts() {
		return postService.get_All();
	}

}