package com.example.demo.controller;

import com.example.demo.dto.FullProductDTO;
import com.example.demo.dto.ProductByIDTO;
import com.example.demo.dto.ProductDisplayDTO;
import com.example.demo.services.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    private final IProductService productService;
    ProductController(IProductService productService){
        this.productService=productService;
    }


    @GetMapping
    public List<ProductDisplayDTO> getAllProducts(){
        return this.productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductByIDTO getProductByID(@PathVariable int id) {
        return productService.getProductByID(id);
    }
}
