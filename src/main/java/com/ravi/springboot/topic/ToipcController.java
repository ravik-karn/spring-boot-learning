package com.ravi.springboot.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToipcController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getTopicByID(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics" , method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topic/{id}" , method = RequestMethod.PUT)
    public void updateTopic(@PathVariable String id,  @RequestBody Topic topic) {
        topicService.updateTopic(id, topic);
    }

    @RequestMapping(value = "/topic/{id}" , method = RequestMethod.DELETE)
    public void updateTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }
}
