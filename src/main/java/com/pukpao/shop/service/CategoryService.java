package com.pukpao.shop.service;

import com.pukpao.shop.model.Category;
import com.pukpao.shop.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category insertCategory(Category category) {
        return categoryRepository.save(category);
    }

}
