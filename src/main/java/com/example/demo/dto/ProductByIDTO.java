package com.example.demo.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true) // ← key for ignoring unknown fields
@JsonInclude(JsonInclude.Include.NON_NULL)  // ← only serialize non-null fields
public class ProductByIDTO {
    private int id;
    private String title;
    private String image;
    private int price;
    private String description;
    private String brand;
    private String model;
    private String color;
    private String category;
    private boolean popular;
    private int discount;
    private boolean onSale;
}
