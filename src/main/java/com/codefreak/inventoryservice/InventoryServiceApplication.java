package com.codefreak.inventoryservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.codefreak.inventoryservice.model.Inventory;
import com.codefreak.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		
		return args->{
			
			Inventory inventory =new Inventory();
			inventory.setSkucode("iphone_13");
			inventory.setQuantity(100);
			
			Inventory inventory1 =new Inventory();
			inventory.setSkucode("iphone_13_red");
			inventory.setQuantity(1);
			
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}
*/
}
