package com.project.shopapp.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    @GetMapping("")
    public ResponseEntity<String> getProducts(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
            ){
            return ResponseEntity.ok(String.format("get products, page = %d, limit = %d", page, limit));

    }
    @GetMapping("/{id}")
    public  ResponseEntity<String> getProductByI(@PathVariable("id") String ProductId){
            return  ResponseEntity.ok("Product with ID" + ProductId);
    }
}
