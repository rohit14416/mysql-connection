package com.rohitlearns.mysql;

import com.rohitlearns.mysql.model.Topic;
import com.rohitlearns.mysql.service.TopicService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET, value = "/allTopics")
    @ApiOperation(value="Finds all the Topics",
                notes="This API call will return all the topics saved in the DB",
                response=Topic.class)
    public List<Topic> findAllTopics() {
        List<Topic> topicList =  topicService.getAllTopics();
        return topicList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/single/{id}")
    @ApiOperation(value="Find Topic bt Id",
                notes="Provide a valid Id to lookup the specific topic",
                response = Topic.class)
    public Topic findTopicById(@ApiParam(value = "ID value for the contact you need to retrieve", required = true)
                            @PathVariable("id") String id) {
        return topicService.getTopicById(id);
    }



    @RequestMapping(method = RequestMethod.POST,value="/topics")
    public String addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
        return "Updated";

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {
        topicService.updateTopic(topic,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/delete/{id}")
    public String deleteTopicWithId(@PathVariable("id") String id) {
        System.out.println("Call 1");
        topicService.deleteTopicById(id);
        return "Deleted";
    }

}
