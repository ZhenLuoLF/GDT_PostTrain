package com.broadridge.productcatalogservice.service.Impl;

import com.broadridge.productcatalogservice.DTO.ProductDTO;
import com.broadridge.productcatalogservice.model.Product;
import com.broadridge.productcatalogservice.repository.ProductRepository;
import com.broadridge.productcatalogservice.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    Logger logger= LoggerFactory.getLogger(ProductServiceImpl.class);

    @Override
    public void log(){
        logger.info("New log add in");
    }

    @Override
    public ProductDTO getProductById(int id) throws Exception {
        Product product = productRepository.findById(id).orElseThrow();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

}
