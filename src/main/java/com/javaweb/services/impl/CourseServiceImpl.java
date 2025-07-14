package com.javaweb.services.impl;

import com.javaweb.dtos.CourseDTO;
import com.javaweb.dtos.CourseTopicDTO;
import com.javaweb.entities.Course;
import com.javaweb.repositories.CourseRepository;
import com.javaweb.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Page<CourseDTO> getAllCoursesDTO(Pageable pageable) {
        return courseRepository.findAll(pageable)
                .map(this::toCourseDTO);
    }

    @Override
    public Page<CourseDTO> searchCoursesDTO(String keyword, Boolean status, Pageable pageable) {
        Specification<Course> spec = Specification.where(null);

        if (keyword != null && !keyword.isEmpty()) {
            spec = spec.and((root, query, cb) ->
                    cb.or(
                            cb.like(cb.lower(root.get("title")), "%" + keyword.toLowerCase() + "%"),
                            cb.like(cb.lower(root.get("description")), "%" + keyword.toLowerCase() + "%")
                    )
            );
        }

        if (status != null) {
            spec = spec.and((root, query, cb) -> cb.equal(root.get("status"), status));
        }

        return courseRepository.findAll(spec, pageable)
                .map(this::toCourseDTO);
    }

    @Override
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    private CourseDTO toCourseDTO(Course course) {
        List<CourseTopicDTO> topicDTOs = new ArrayList<>();
        if (course.getTopics() != null) {
            for (var topic : course.getTopics()) {
                topicDTOs.add(new CourseTopicDTO(topic.getTopicId(), topic.getName()));
            }
        }
        return new CourseDTO(
                course.getCourseId(),
                course.getTitle(),
                course.getDescription(),
                course.getPrice(),
                course.getRating(),
                course.getImageUrl(),
                course.getVideoTrailerUrl(),
                course.getStatus(),
                topicDTOs
        );
    }
}

