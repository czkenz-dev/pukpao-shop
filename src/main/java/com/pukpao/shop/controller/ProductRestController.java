package com.pukpao.shop.controller;

import com.pukpao.shop.model.Product;
import com.pukpao.shop.repository.ProductRepository;
import com.pukpao.shop.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    private ProductService productService;
    private ProductRepository productRepository;

    public ProductRestController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> findAllProduct() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) throws Exception {
        return productService.insertProduct(product);
    }

}
