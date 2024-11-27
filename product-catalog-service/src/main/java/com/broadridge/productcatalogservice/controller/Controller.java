package com.broadridge.productcatalogservice.controller;

import com.broadridge.productcatalogservice.DTO.ProductDTO;

import com.broadridge.productcatalogservice.service.ProductService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    ProductService productService;

    private final RestTemplate restTemplate;

    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/addLog")
    public void addLog() {
        productService.log();
    }

    @RequestMapping("/restTemp")
    public String restTemp() {
        String accountServiceUrl = "http://localhost:8082/api/message";
        return restTemplate.getForObject(accountServiceUrl, String.class);
    }
    @RequestMapping("/getProduct/{id}")
    public ProductDTO getProduct(@PathVariable("id") int id) {
        ProductDTO product = new ProductDTO();
        product.setId(id);
        product.setCategory("product category");
        product.setName("product name");
        product.setDescription("product description");
        return product;
    }

//    @RequestMapping("/getProduct")
//    public ProductDTO getProduct() {
//        ProductDTO product = new ProductDTO();
//        product.setId(1);
//        product.setCategory("product category");
//        product.setName("product name");
//        product.setDescription("product description");
//        return product;
//    }


}