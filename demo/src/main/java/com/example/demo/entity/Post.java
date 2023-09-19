package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int post_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name ="description")
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="pc_fk", referencedColumnName = "post_id")
	private List<Comment> comments;
	
	
	
	
	public Post() {
		super();
	}
	public Post(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Post [post_id=" + post_id + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
}
