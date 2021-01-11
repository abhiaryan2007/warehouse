package com.warehouse.app;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.warehouse.services.InventoryService;
import com.warehouse.services.ProductsService;
import com.warehouse.dao.Inventory;
import com.warehouse.dao.Products;



@SpringBootApplication
@ComponentScan({"com.warehouse.services"})
@EntityScan("com.warehouse.dao")
@EnableJpaRepositories("com.warehouse.repository")

public class WebWarehouseApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(WebWarehouseApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(InventoryService inventoryService) {
		return args -> {
			// read inventory.json and write to db
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true );
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			TypeReference<List<Inventory>> typeReference = new TypeReference<List<Inventory>>() {};
			
			InputStream inputStream = TypeReference.class.getResourceAsStream("/inventory.json");
			try {
				List<Inventory> inventoryValue = mapper.readValue(inputStream,typeReference);
				
				System.out.println("Inventory Saved!");
			} 
			catch (IOException e){	
				System.out.println("Unable to save Inventory: " + e.getMessage());
			}
		};
	}


	/*
	 * @Bean CommandLineRunner runner(ProductsService productsService) { return args
	 * -> { // read products.json and write to db ObjectMapper mapper = new
	 * ObjectMapper();
	 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
	 * mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	 * TypeReference<List<Products>> typeReference = new
	 * TypeReference<List<Products>>() {};
	 * 
	 * InputStream inputStream =
	 * TypeReference.class.getResourceAsStream("/products.json"); try {
	 * List<Products> productsList = mapper.readValue(inputStream,typeReference);
	 * ProductsService.save(productsList); System.out.println("Products Saved!"); }
	 * catch (IOException e){ System.out.println("Unable to save Products: "
	 * +e.getMessage()); } }; }
	 */

}




