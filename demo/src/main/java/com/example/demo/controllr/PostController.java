package com.example.demo.controllr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;

@RestController
@RequestMapping("post")
public class PostController {

	@Autowired
	PostService postService;
	
	@PostMapping("addpost")
	public String addPost(@RequestBody Post post) {
		return postService.addPost(post);
	}
	
	@DeleteMapping("path/{id}")
	public String deletePost(@PathVariable int id) {
		return postService.deletePost(id);
	}
	
	@GetMapping("getall")
	public List<Post> getAllPost(){
		return postService.getAllPost();
	}

	
}
