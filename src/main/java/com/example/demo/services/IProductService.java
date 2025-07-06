package com.example.demo.services;

import com.example.demo.dto.ProductByIDTO;
import com.example.demo.dto.ProductDisplayDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    public List<ProductDisplayDTO> getAllProducts();
    public ProductByIDTO getProductByID(int id);
}
