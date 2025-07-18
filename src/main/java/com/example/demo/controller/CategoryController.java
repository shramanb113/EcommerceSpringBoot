package com.example.demo.controller;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.services.ICategoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private final ICategoryService categoryService;

    // Constructor-based dependency injection
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAllCategories() {
        List<CategoryDTO> result= this.categoryService.getAllCategories();
        return ResponseEntity.ok(result);

    }
}
