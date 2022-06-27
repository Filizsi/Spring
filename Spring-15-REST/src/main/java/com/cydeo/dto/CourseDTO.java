package com.cydeo.dto;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class CourseDTO {


    private Long id;


    private String name;


    private String category;


    private int rating;


    private String description;

}
