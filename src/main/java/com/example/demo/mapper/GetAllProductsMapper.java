package com.example.demo.mapper;


import com.example.demo.dto.FakeStoreProductResponseDTO;
import com.example.demo.dto.ProductDisplayDTO;

import java.util.List;
import java.util.stream.Collectors;

public class GetAllProductsMapper {

    public static List<ProductDisplayDTO> toConvertToProductDisplayDTO(FakeStoreProductResponseDTO dto){
        return dto.getProducts()
                .stream()
                .map(prod->ProductDisplayDTO.builder()
                        .id(prod.getId())
                        .price(prod.getPrice())
                        .category(prod.getCategory())
                        .title(prod.getTitle())
                        .build())
                .toList();
    }
}
