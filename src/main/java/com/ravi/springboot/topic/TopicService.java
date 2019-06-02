package com.ravi.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "a", "a-desc"),
            new Topic("2", "b", "b-desc"),
            new Topic("3", "c", "c-desc")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.hasId(id)).findFirst().get();
    }
}
