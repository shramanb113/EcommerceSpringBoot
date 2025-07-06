package com.example.demo.gateway;


import com.example.demo.dto.*;
import com.example.demo.gateway.api.FakeStoreProductAPI;
import org.springframework.stereotype.Component;
import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreProductGateway implements IProductGateway {

    private final FakeStoreProductAPI fakeStoreProductAPI;

    public FakeStoreProductGateway(FakeStoreProductAPI fakeStoreProductAPI) {
        this.fakeStoreProductAPI = fakeStoreProductAPI;
    }

    @Override
    public List<ProductDisplayDTO> getAllProducts() {
        FakeStoreProductResponseDTO response = fakeStoreProductAPI.getAllFakeProducts();

        if (response == null || response.getProducts() == null) {
            throw new RuntimeException("Empty response from FakeStore API");
        }

        return response.getProducts()
                .stream()
                .map(prod-> ProductDisplayDTO.builder()
                        .id(prod.getId())
                        .title(prod.getTitle())
                        .category(prod.getCategory())
                        .price(prod.getPrice())
                        .build())
                .toList();
    }

    @Override
    public ProductByIDTO getProductByID(int id) throws IOException {
        FakeStoreProductByIDResponseDTO response = fakeStoreProductAPI.getAllFakeProductsByID(id);

        if(response==null){
            throw new RuntimeException("Empty response from FakeStore API");
        }
        return response.getProduct();
    }


}

