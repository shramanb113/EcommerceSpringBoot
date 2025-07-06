package com.example.demo.gateway;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.dto.FakeStoreCategoryResponseDTO;
import com.example.demo.gateway.api.FakeStoreCategoryWebClientAPI;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component("FakeStoreCategoryWebClientGateway")
public class FakeStoreCategoryWebClientGateway implements ICategoryGateway {

   private final FakeStoreCategoryWebClientAPI fakeStoreCategoryWebClientAPI;

    public FakeStoreCategoryWebClientGateway(FakeStoreCategoryWebClientAPI fakeStoreCategoryWebClientAPI) {
        this.fakeStoreCategoryWebClientAPI = fakeStoreCategoryWebClientAPI;
    }

    @Override
    public List<CategoryDTO> getAllCategories() throws IOException {
        ResponseEntity<FakeStoreCategoryResponseDTO> fakeStoreCategoryResponseDTO=fakeStoreCategoryWebClientAPI.getAllFakeStoreCategories();
        if(fakeStoreCategoryResponseDTO.getBody()==null){
            throw new IOException("Not Received");
        }
        else{
            return fakeStoreCategoryResponseDTO.getBody().getCategories()
                    .stream()
                    .map(category->CategoryDTO
                            .builder()
                            .name(category)
                            .build())
                    .toList();
        }
    }
}
