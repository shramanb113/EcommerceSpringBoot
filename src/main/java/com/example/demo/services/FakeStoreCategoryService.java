package com.example.demo.services;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.gateway.ICategoryGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService {

    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(
            @Qualifier("FakeStoreCategoryWebClientGateway") ICategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        try {
            return categoryGateway.getAllCategories();
        } catch (IOException e) {
            throw new RuntimeException("Failed to fetch categories", e);
        }
    }
}
