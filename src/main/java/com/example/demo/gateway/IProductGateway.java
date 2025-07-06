package com.example.demo.gateway;

import com.example.demo.dto.FullProductDTO;
import com.example.demo.dto.ProductByIDTO;
import com.example.demo.dto.ProductDisplayDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface IProductGateway {
    List<ProductDisplayDTO> getAllProducts() throws IOException;
    ProductByIDTO getProductByID(int id) throws IOException;

}
