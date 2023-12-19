package com.gleeko.ecommerce.service;

import com.gleeko.productservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductServiceClient {
    private final RestTemplate restTemplate;
    private final String productServiceUrl = "http://localhost:8080/products";

    @Autowired
    public ProductServiceClient(RestTemplate restTemplate){
        this.restTemplate= restTemplate;
    }

    public Product getProductById(long id){
        return restTemplate.getForObject(productServiceUrl+"/"+id, Product.class);
    }
}
