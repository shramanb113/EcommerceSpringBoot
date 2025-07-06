package com.example.demo.mapper;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllCategoriesMapper {

    public static List<CategoryDTO> convertFromFakeStoreCategoryResponseDTOtoCategoryDTO(FakeStoreCategoryResponseDTO dto){
        return dto.getCategories().stream().map(category->CategoryDTO.builder().name(category).build()).toList();
    }
}
