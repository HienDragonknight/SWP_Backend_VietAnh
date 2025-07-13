package com.javaweb.controller;


import com.javaweb.entities.TopicEntity;
import com.javaweb.services.TopicService;
import jakarta.validation.constraints.Positive;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin/topics")
@Validated
public class TopicAPI {

    private final TopicService topicService;

    public TopicAPI(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping()
    public ResponseEntity<List<TopicEntity>> getAllTopics(){
        return ResponseEntity.ok(topicService.getAllTopics());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<TopicEntity>> getTopic(@PathVariable @Positive Long id) {
        return  ResponseEntity.ok(topicService.getTopic(id));
    }

}
