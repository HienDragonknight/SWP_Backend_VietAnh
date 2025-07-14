package com.javaweb.dtos;

public class CourseTopicDTO {
    private Long topicId;
    private String topicName;

    public CourseTopicDTO(Long topicId, String topicName) {
        this.topicId = topicId;
        this.topicName = topicName;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }
}
