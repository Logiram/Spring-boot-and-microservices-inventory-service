package com.codefreak.inventoryservice.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codefreak.inventoryservice.dto.InventoryResponse;
import com.codefreak.inventoryservice.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{

	  List<Inventory> findAllBySkuCodeIn(List<String> skuCode);
	 /* @Query("select c.id,c.quantity,c.skuCode from t_inventory c where c.skuCode = :skuCode")
	    Stream<Customer> findByEmailReturnStream(@Param("email") String email);*/



	//Collection<InventoryResponse> findBySkuCode(List<String> skuCode);

}
