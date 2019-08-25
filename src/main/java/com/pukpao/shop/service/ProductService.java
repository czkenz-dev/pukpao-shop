package com.pukpao.shop.service;

import com.pukpao.shop.model.Product;
import com.pukpao.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

}
