package com.javaweb.services.impl;


import com.javaweb.entities.TopicEntity;
import com.javaweb.repositories.TopicRepository;
import com.javaweb.services.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;





    @Override
    public Optional<TopicEntity> getTopic(Long id) {
        return  topicRepository.findById(id);
    }




    @Override
    public List<TopicEntity> getAllTopics() {
        List<TopicEntity> topicEntities = topicRepository.findAll();
        return topicEntities;
    }


}
