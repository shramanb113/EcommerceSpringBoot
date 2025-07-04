package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder
public class FakeStoreCategoryResponseDTO {

    private String status;
    private String message;
    private List<String> categories;

}
