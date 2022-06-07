package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import com.cydeo.entity.Course;
import com.cydeo.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/course/api/v1")
public class CoursesController {

    private final CourseService courseService;

    public CoursesController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping()
    public List<CourseDTO> getAllCourses(){
        List<CourseDTO> list = courseService.getCourses();
        return list;
    }

    @GetMapping("{id}")
    public CourseDTO getCourseById(@PathVariable ("id") Long courseId){
        CourseDTO dto = courseService.getCourseById(courseId);
        return dto;
    }

    @GetMapping("category/{name}")
    public List<CourseDTO> getCourseByCategory(@PathVariable("name") String category){
        return courseService.getCoursesByCategory(category);
    }


    @PostMapping()
    public CourseDTO createCourse(@RequestBody CourseDTO course){
        return courseService.createCourse(course);
    }

    @PutMapping("{id}")
    public void updateCourse(@PathVariable("id") Long courseId, @RequestBody CourseDTO courseDTO){
        courseService.updateCourse(courseId,courseDTO);

    }

    @DeleteMapping("{id}")
    public void deleteCourseById(@PathVariable("id") Long courseId){
        courseService.deleteCourseById(courseId);

    }

    @DeleteMapping
    public void deleteCourses(){
        courseService.deleteCourses();
    }
}
