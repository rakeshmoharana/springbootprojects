package io.javabrains.springbootstarter.topic;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import io.javabrains.springbootstarter.course.Course;

@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String description;
	
//	@OneToMany(mappedBy = "topic" , fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//	private List<Course> courses;
//	
//	public List<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(List<Course> courses) {
//		this.courses = courses;
//	}

	public Topic() {
		
	}
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
