package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeStoreProductResponseDTO {
    private String status;
    private String message;
    private List<FullProductDTO> products;
}
