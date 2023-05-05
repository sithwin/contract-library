package com.example.library.service;

import com.example.library.client.CourseClient;
import com.example.library.model.Course;
import com.example.library.model.ProductPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private CourseClient course;

//  public ProductService(CourseClient course) {
//    this.course = course;
//  }

  private List<Course> getCourses() {
    var response = this.course.getCourses();
    return response.getBody();
  }

  public ProductPrice getPrice(String name) {
    var totalPrice = getCourses().stream()
        .peek(c -> c.setPrice(c.getPrice() + 250))
        .mapToInt(Course::getPrice)
        .sum();

    ProductPrice productPrice = new ProductPrice();
    productPrice.setBasePrice(250);
    productPrice.setTotalPrice(totalPrice);

    return productPrice;
  }
}
