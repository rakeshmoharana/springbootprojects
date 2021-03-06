package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
	@Autowired
	private TopicRepository topicRepository;
	
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","Core Java Description"),
			new Topic("javascript","javascript Framework","javascript Framework Description")
							));
	
	public List<Topic> getAllTopics(){
//		return topics;
		List<Topic> topics=new ArrayList<Topic>();
	topicRepository.findAll().forEach(topics::add);
	return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topicRepository.findOne(id);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				return topic;
//			}
//		}
//		return null;
	}
	
	public void addTopic(Topic topic) {
		System.out.println(topic.getId());
	
		topicRepository.save(topic);
	}

	public void updateTopic(Topic reqTopic, String id) {
		// TODO Auto-generated method stub
		topicRepository.save(reqTopic);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				topic.setName(reqTopic.getName());
//				topic.setDescription(reqTopic.getDescription());
//			}
//		}
	}
	
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicRepository.delete(id);
//		for(Topic topic:topics) {
//			if(topic!=null && topic.getId()!=null && topic.getId().equalsIgnoreCase(id)) {
//				this.topics.remove(topic);
//			}
//		}
	}
}
 