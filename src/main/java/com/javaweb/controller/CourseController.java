package com.javaweb.controller;

import com.javaweb.dtos.CourseDTO;
import com.javaweb.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin("*")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Danh sách khóa học (có phân trang)
    @GetMapping
    public ResponseEntity<Page<CourseDTO>> getAllCourses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(courseService.getAllCoursesDTO(pageable));
    }

    // Tìm kiếm / Lọc khóa học
    @GetMapping("/search")
    public ResponseEntity<Page<CourseDTO>> searchCourses(
            @RequestParam(required = false) String keyword,
            @RequestParam(required = false) Boolean status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(courseService.searchCoursesDTO(keyword, status, pageable));
    }

    // Xem chi tiết khóa học
    @GetMapping("/{id}")
    public ResponseEntity<?> getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
