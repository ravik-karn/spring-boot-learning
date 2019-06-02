package com.ravi.springboot.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "a", "a-desc"),
            new Topic("2", "b", "b-desc"),
            new Topic("3", "c", "c-desc")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.hasId(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).hasId(id)) {
                topics.set(i, topic);
            }
        }
    }

    public void deleteTopic(String id) {
        this.topics.removeIf(t -> t.hasId(id));
    }
}
