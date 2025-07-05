package com.example.demo.controller;

import com.example.demo.dto.FullProductDTO;
import com.example.demo.services.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final IProductService productService;
    ProductController(IProductService productService){
        this.productService=productService;
    }


    @GetMapping
    public List<FullProductDTO> getAllProducts(){
        return this.productService.getAllProducts();
    }
}
