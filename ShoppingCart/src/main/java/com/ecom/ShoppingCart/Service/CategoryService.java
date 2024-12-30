package com.ecom.ShoppingCart.Service;

import java.util.List;
import com.ecom.ShoppingCart.Model.Category; // Adjust the path to your actual `Category` class


public interface CategoryService {
    
    public Category saveCategory(Category category);
    public boolean existCategory(String name);
    public List<Category> getAllCategory();
}
