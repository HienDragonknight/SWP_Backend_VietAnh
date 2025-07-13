package com.javaweb.services;

import com.javaweb.entities.TopicEntity;

import java.util.List;
import java.util.Optional;

public interface TopicService {
    Optional<TopicEntity> getTopic(Long id);
    List<TopicEntity> getAllTopics();

}
