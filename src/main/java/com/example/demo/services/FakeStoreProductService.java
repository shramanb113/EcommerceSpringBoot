package com.example.demo.services;

import com.example.demo.dto.FullProductDTO;
import com.example.demo.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements IProductService {

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public List<FullProductDTO> getAllProducts() {
        try {
            return this.productGateway.getAllProducts();
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve products", e);
        }
    }
}
