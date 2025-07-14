package com.javaweb.dtos;

import java.util.List;

public class CourseDTO {
    private Long courseId;
    private String title;
    private String description;
    private Long price;
    private Float rating;
    private String imageUrl;
    private String videoTrailerUrl;
    private Boolean status;
    private List<CourseTopicDTO> courseTopics;

    public CourseDTO() {}

    public CourseDTO(Long courseId, String title, String description, Long price, Float rating, String imageUrl, String videoTrailerUrl, Boolean status, List<CourseTopicDTO> courseTopics) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.imageUrl = imageUrl;
        this.videoTrailerUrl = videoTrailerUrl;
        this.status = status;
        this.courseTopics = courseTopics;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getVideoTrailerUrl() {
        return videoTrailerUrl;
    }

    public void setVideoTrailerUrl(String videoTrailerUrl) {
        this.videoTrailerUrl = videoTrailerUrl;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<CourseTopicDTO> getCourseTopics() {
        return courseTopics;
    }

    public void setCourseTopics(List<CourseTopicDTO> courseTopics) {
        this.courseTopics = courseTopics;
    }
}
