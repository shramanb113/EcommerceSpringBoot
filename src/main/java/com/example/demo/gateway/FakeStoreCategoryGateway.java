package com.example.demo.gateway;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import com.example.demo.gateway.api.FakeStoreCategoryAPI;
import com.example.demo.mapper.GetAllCategoriesMapper;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway {

    private final FakeStoreCategoryAPI fakeStoreCategoryAPI;

    FakeStoreCategoryGateway(FakeStoreCategoryAPI fakeStoreCategoryAPI){
        this.fakeStoreCategoryAPI=fakeStoreCategoryAPI;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        FakeStoreCategoryResponseDTO responseDTO = this.fakeStoreCategoryAPI.getAllFakeCategories().execute().body();
        if(responseDTO==null){
            throw new IOException("Failed to fetch categories from fakestore");
        }
        return GetAllCategoriesMapper.convertFromFakeStoreCategoryResponseDTOtoCategoryDTO(responseDTO);
    }
}
