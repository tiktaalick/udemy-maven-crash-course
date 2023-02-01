package org.mark.product.dto;

import lombok.Data;

@Data
public class Product {

    private int    id;
    private String name;
    private String description;
    private int    price;
}
