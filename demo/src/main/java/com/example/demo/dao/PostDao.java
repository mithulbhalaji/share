package com.example.demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;


@Repository
public class PostDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public String addPost(Post post) {
		Session session = sessionFactory.openSession();
		session.save(post);
		session.beginTransaction().commit();
		return "Successfully saved";
	}

	public String deletePost(int id) {
		Session session= sessionFactory.openSession();
		Post post = session.get(Post.class, id);
		session.delete(post);
		session.beginTransaction().commit();
		return "Successfully deleted";
		
	}

	public List<Post> getAllPost() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Post.class);
		return criteria.list();
	}

}
