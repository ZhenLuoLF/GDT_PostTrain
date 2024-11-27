package com.broadridge.productcatalogservice.service;

import com.broadridge.productcatalogservice.DTO.ProductDTO;

public interface ProductService {
    void log();
    ProductDTO getProductById(int id) throws Exception;
}
