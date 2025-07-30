package com.example.demo.entity;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseEntity {

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


