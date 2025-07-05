package com.example.demo.services;

import com.example.demo.dto.FullProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    public List<FullProductDTO> getAllProducts();
}
