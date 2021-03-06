package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable("topicId") String topicId) {
			return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping("topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable("courseId") String courseId) {
			return courseService.getCourse(courseId);
	}
	
	@RequestMapping(value = "topics/{topicId}/courses",method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course, @PathVariable("topicId") String topicId) {
		System.out.println(topicId+"  "+course.getId());
		course.setTopic(new Topic(topicId,"",""));	
		courseService.addCourse(course);
	}
	
	@RequestMapping(value = "topics/{topicId}/courses/{courseId}",method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course reqCourse, @PathVariable("courseId") String courseId,@PathVariable("topicId") String topicId) {
		reqCourse.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(reqCourse, courseId);
	}
	
	@RequestMapping(value = "topics/{topicId}/courses/{courseId}",method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable("courseId") String courseId) {
			courseService.deleteCourse(courseId);
	}
}
