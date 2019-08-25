package com.pukpao.shop.controller;

import com.pukpao.shop.model.Category;
import com.pukpao.shop.repository.CategoryRepository;
import com.pukpao.shop.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController {

    private CategoryService categoryService;
    private CategoryRepository categoryRepository;

    public CategoryRestController(CategoryService categoryService, CategoryRepository categoryRepository) {
        this.categoryService = categoryService;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    @PostMapping
    public Category saveCategory(@RequestBody Category category) {
        return categoryService.insertCategory(category);
    }

}
