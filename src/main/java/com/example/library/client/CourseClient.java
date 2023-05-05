package com.example.library.client;


import com.example.library.model.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;



@FeignClient(name = "course-service", url = "http://localhost:5001/")
public interface CourseClient {
  @GetMapping("courses/{name}")
  ResponseEntity<Course> getCourseByName(@PathVariable(value = "name") String name);

  @GetMapping("courses")
  ResponseEntity<List<Course>> getCourses();
}
