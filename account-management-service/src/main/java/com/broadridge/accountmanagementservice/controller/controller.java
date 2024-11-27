package com.broadridge.accountmanagementservice.controller;

import com.broadridge.accountmanagementservice.DTO.ProductDTO;
import com.broadridge.accountmanagementservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/message")
    public String getMessage(){
        return "Message from AccountService";
    }

    @RequestMapping("/getProductFromAccount/{id}")
    public ProductDTO getProductFromAccount(@PathVariable String id){
        ProductDTO productDTO = accountService.getProductById(id);
        return productDTO;
    }

}
