package com.javaweb.dtos;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TopicDTO {
    private Long topicid;
    private String name;
    private String description;
    private int courseCount;
    private String status;
}
