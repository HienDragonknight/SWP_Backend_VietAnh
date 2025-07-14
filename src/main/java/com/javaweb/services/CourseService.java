package com.javaweb.services;

import com.javaweb.entities.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

import com.javaweb.dtos.CourseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface CourseService {
    Page<CourseDTO> getAllCoursesDTO(Pageable pageable);
    Page<CourseDTO> searchCoursesDTO(String keyword, Boolean status, Pageable pageable);
    Optional<Course> getCourseById(Long id);
}

