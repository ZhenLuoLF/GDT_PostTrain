package com.broadridge.productcatalogservice.DTO;

import lombok.Data;

@Data
public class ProductDTO {
    private int id;
    private String name;
    private String description;
    private String category;
    private double price;
}
