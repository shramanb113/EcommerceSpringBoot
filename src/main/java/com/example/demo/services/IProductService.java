package com.example.demo.services;

import com.example.demo.dto.FullProductDTO;
import com.example.demo.dto.ProductByIDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IProductService {
    public List<FullProductDTO> getAllProducts();
    public ProductByIDTO getProductByID(int id);
}
