package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PostDao;
import com.example.demo.entity.Post;

@Service
public class PostService {

	@Autowired
	PostDao postDao;
	
	public String addPost(Post post) {
		return postDao.addPost(post);
	}

	public String deletePost(int id) {
		return postDao.deletePost(id);
	}

	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return postDao.getAllPost();
	}

}
