package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    List<String> getAllCategories();
}
