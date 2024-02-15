package com.programming.inventoryservice.service;

import com.programming.inventoryservice.model.Inventory;
import com.programming.inventoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    /**
     * @param skuCode
     * @return
     * @Transactional: Indicates that the method must be executed in a transaction
     * readOnly = true: This option specifies that the transaction is in read-only mode
     * This means that the method will only read data from the database, but will not modify the data
     */
    @Transactional(readOnly = true)
    public boolean isInStock(String skuCode) {
        return inventoryRepository.findBySkuCode(skuCode).isPresent();

    }

}
