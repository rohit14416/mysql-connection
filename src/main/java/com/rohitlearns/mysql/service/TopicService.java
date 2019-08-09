package com.rohitlearns.mysql.service;

import com.rohitlearns.mysql.model.Topic;
import com.rohitlearns.mysql.repository.TopicRepository;
import com.rohitlearns.mysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Qualifier("topicService")
public class TopicService {

    @Autowired
    @Qualifier("topicRepository")
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> t = (List <Topic>) (topicRepository.findAll());
        t.stream().map(name -> name.getName()).collect(Collectors.toList());
        t.forEach(n -> System.out.println(n));
        return t;
    }

    public Topic getTopicById(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public Topic addTopic(Topic topic) {
       Topic newtopic = topicRepository.save(topic);
        System.out.println("New Topics::" +newtopic);
       return newtopic;
    }

    public void updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }


    public void deleteTopicById(String id) {
        System.out.println("Call 2, id = " +id);
         topicRepository.deleteById(id);
    }
}
