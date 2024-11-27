package com.broadridge.accountmanagementservice.service.Impl;

import com.broadridge.accountmanagementservice.DTO.ProductDTO;
import com.broadridge.accountmanagementservice.service.AccountService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountServiceImpl implements AccountService {

    private final RestTemplate restTemplate;
    private static final String PRODUCT_SERVICE = "productCatalogService";

    public AccountServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = PRODUCT_SERVICE, fallbackMethod = "getDefaultProduct")
    public ProductDTO getProductById(String productId) {
        System.out.println("getProductById");
        ProductDTO dto = new ProductDTO();
        // ProductDTO productDTO = restTemplate.getForObject("http://localhost:8081/api/getProduct/" + productId, ProductDTO.class);
        ProductDTO productDTO = restTemplate.getForObject("http://product-catalog-service/api/getProduct/" + productId, ProductDTO.class);
        System.out.println("After getProductById");
        return productDTO;
    }

    public ProductDTO getDefaultProduct(Throwable throwable) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(1);
        productDTO.setName("Default Product");
        return productDTO;
    }

}
