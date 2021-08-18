package io.javabrains.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
	@Autowired
	private CourseRepository courseRepository;
	
//	
//	private List<Course> topics = new ArrayList<>(Arrays.asList(
//			new Course("Spring","Spring Framework","Spring Framework Description"),
//			new Course("Java","Core Java","Core Java Description"),
//			new Course("javascript","javascript Framework","javascript Framework Description")
//							));
//	
	public List<Course> getAllCourses(String topicId){
//		return topics;
		List<Course> courses=new ArrayList<Course>();
	courseRepository.findByTopicId(topicId).forEach(courses::add);
	return courses;
	}
	
	public Course getCourse(String id) {
		
		return courseRepository.findOne(id);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				return topic;
//			}
//		}
//		return null;
	}
	
	public void addCourse(Course course) {
		System.out.println(course.getId());
	
		courseRepository.save(course);
	}

	public void updateCourse(Course reqCourse, String id) {
		// TODO Auto-generated method stub
		courseRepository.save(reqCourse);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				topic.setName(reqTopic.getName());
//				topic.setDescription(reqTopic.getDescription());
//			}
//		}
	}
	
	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		courseRepository.delete(id);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				this.topics.remove(topic);
//			}
//		}
	}
}
 