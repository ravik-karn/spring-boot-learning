package com.ravi.springboot.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ToipcController {
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("1", "a", "a-desc"),
                new Topic("2", "b", "b-desc"),
                new Topic("3", "c", "c-desc")
        );
    }
}
