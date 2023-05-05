package com.example.library.controller;

import com.example.library.repository.BookEntity;
import com.example.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
  @Autowired
  BookRepository repository;

  @GetMapping("/books")
  @CrossOrigin
  public ResponseEntity<List<BookEntity>> getCourses() {
    return ResponseEntity.ok(repository.findAll());
  }

  @GetMapping("/books/{name}")
  @CrossOrigin
  public ResponseEntity<BookEntity> getCourseByName(@PathVariable(value = "name") String name) {
    return ResponseEntity.ok(repository.findById(name).get());
  }
}
