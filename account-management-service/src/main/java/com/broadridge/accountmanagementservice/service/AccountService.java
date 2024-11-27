package com.broadridge.accountmanagementservice.service;

import com.broadridge.accountmanagementservice.DTO.ProductDTO;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    public ProductDTO getProductById(String productId);
}
