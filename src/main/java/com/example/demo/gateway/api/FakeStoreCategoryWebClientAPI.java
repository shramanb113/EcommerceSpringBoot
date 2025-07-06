package com.example.demo.gateway.api;

import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import com.example.demo.dto.FakeStoreProductResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class FakeStoreCategoryWebClientAPI {
    private final WebClient webClient;

    public FakeStoreCategoryWebClientAPI(WebClient webClient) {
        this.webClient = webClient;
    }

    public ResponseEntity<FakeStoreCategoryResponseDTO> getAllFakeStoreCategories(){
        return webClient.get()
                .uri("api/products/category")
                .retrieve()
                .toEntity(FakeStoreCategoryResponseDTO.class)
                .block();

    }
}
