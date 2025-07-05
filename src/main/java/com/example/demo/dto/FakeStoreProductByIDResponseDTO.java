package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class FakeStoreProductByIDResponseDTO {
    private String status;
    private String message;
    private ProductByIDTO product;
}
