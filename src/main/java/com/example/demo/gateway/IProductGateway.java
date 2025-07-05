package com.example.demo.gateway;

import com.example.demo.dto.FullProductDTO;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public interface IProductGateway {
    public List<FullProductDTO> getAllProducts() throws IOException;
}
