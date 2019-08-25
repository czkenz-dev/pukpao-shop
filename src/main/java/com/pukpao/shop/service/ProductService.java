package com.pukpao.shop.service;

import com.pukpao.shop.model.Category;
import com.pukpao.shop.model.Product;
import com.pukpao.shop.repository.CategoryRepository;
import com.pukpao.shop.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class ProductService {

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product insertProduct(Product product) throws Exception {
        Optional<Category> category = categoryRepository.findById(product.getCategory().getId());
        if (category.isPresent()) {
            product = productRepository.save(product);
        } else {
            throw new Exception("Category not found.");
        }
        return product;
    }

}
