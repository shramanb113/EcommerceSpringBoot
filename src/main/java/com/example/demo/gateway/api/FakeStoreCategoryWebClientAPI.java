package com.example.demo.gateway.api;

import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import com.example.demo.dto.FakeStoreProductResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class FakeStoreCategoryWebClientAPI {
    private final WebClient webClient;

    public FakeStoreCategoryWebClientAPI(WebClient webClient) {
        this.webClient = webClient;
    }

    public FakeStoreCategoryResponseDTO getAllFakeStoreCategories(){
        return webClient.get()
                .uri("api/products/category")
                .retrieve()
                .bodyToMono(FakeStoreCategoryResponseDTO.class)
                .block();

    }
}
