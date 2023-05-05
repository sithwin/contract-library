package com.example.library.controller;

import com.example.library.model.ProductPrice;
import com.example.library.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  @Autowired
  ProductService service;

  @GetMapping("/products/totalPrice")
  public ProductPrice getTotalPrice() {
    return service.getPrice("Java");
  }
}
