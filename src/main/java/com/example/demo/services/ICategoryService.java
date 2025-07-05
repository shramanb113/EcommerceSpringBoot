package com.example.demo.services;

import com.example.demo.dto.CategoryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    List<CategoryDTO> getAllCategories();
}
