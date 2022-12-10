package com.cloud.api.products;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    Product one(@PathVariable Long id) {

        Product product = new Product();
        product.setId("1");
        product.setName("ProductA");
        product.setType("Sample Product");

        return product;
    }
}
