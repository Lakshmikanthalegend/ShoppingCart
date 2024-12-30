package com.ecom.ShoppingCart.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ShoppingCart.Model.Category; // Import your Category class
import com.ecom.ShoppingCart.Repository.CategoryRepository;
import com.ecom.ShoppingCart.Service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public boolean existCategory(String name) {
        return categoryRepository.existsByName(name);
    }
}
