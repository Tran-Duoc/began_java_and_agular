package com.project.shopapp.controller;

import com.project.shopapp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.util.Objects;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    @GetMapping("")
    public ResponseEntity<String> getAllCategory(
        @RequestParam("page")   int page,
        @RequestParam("limit")  int limit
    ){
            return ResponseEntity.ok(String.format("all category, page = %d, limit = %d", page, limit));
    }
    @PostMapping("")
    public ResponseEntity<?> createdCategories(@Valid @RequestBody CategoryDTO categoryDTO, BindingResult result){
        if(result.hasErrors()){
              String errorMessage =  Objects.requireNonNull(result.getFieldError()).getDefaultMessage();
             return  ResponseEntity.badRequest().body(errorMessage);
        }


        return ResponseEntity.ok("created success category " + categoryDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updatedCategories (@PathVariable Long id){
        return ResponseEntity.ok("update success category" + id);
    }
}
