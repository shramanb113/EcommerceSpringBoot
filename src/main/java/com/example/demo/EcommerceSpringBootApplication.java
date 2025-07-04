package com.example.demo;

import io.github.cdimascio.dotenv.Dotenv;
import okhttp3.OkHttpClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SpringBootApplication
public class EcommerceSpringBootApplication {

	public static void main(String[] args) {

		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue())
		);



		// Launch Spring Boot
		SpringApplication.run(EcommerceSpringBootApplication.class, args);
	}
}
