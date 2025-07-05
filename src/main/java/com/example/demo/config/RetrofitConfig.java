package com.example.demo.config;

import com.example.demo.gateway.api.FakeStoreCategoryAPI;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Configuration
public class RetrofitConfig {

    @Value("${fakeStore.url}")
    private String url;



    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build();
    }

    @Bean
    public FakeStoreCategoryAPI fakeStoreCategoryAPI(Retrofit retrofit) {
        return retrofit.create(FakeStoreCategoryAPI.class);
    }
}
