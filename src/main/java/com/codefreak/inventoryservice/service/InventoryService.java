package com.codefreak.inventoryservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codefreak.inventoryservice.dto.InventoryResponse;
import com.codefreak.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {
	private final InventoryRepository inventoryRepository;
	
	@Transactional(readOnly = true)
	 @SneakyThrows
	public List<InventoryResponse> isinStock(List<String> skuCode) {
        log.info("Checking Inventory");
        log.info("new change by findall and  column ");
      log.info("----------"+inventoryRepository.findAllBySkuCodeIn(skuCode));
        
        return inventoryRepository.findAllBySkuCodeIn(skuCode).stream().map(inventory -> InventoryResponse.builder().skuCode(inventory.getSkuCode()).isInStock(inventory.getQuantity() > 0).build()).collect(Collectors.toList());
    }
}
