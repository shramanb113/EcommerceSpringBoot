package com.example.demo.gateway.api;

import com.example.demo.dto.FakeStoreProductByIDResponseDTO;
import com.example.demo.dto.FakeStoreProductResponseDTO;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class FakeStoreProductAPI {

    private final WebClient webClient;

    public FakeStoreProductAPI(WebClient webClient) {
        this.webClient = webClient;
    }

    public FakeStoreProductResponseDTO getAllFakeProducts() {
        return webClient.get()
                .uri("api/products")
                .retrieve()
                .bodyToMono(FakeStoreProductResponseDTO.class)
                .block();
    }
    public FakeStoreProductByIDResponseDTO getAllFakeProductsByID(int id) {
        return webClient.get()
                .uri("api/products/{id}", id)   // ✅ substitute properly
                .retrieve()
                .bodyToMono(FakeStoreProductByIDResponseDTO.class)
                .block();
    }

}
