package com.ecom.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.ShoppingCart.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    public Boolean existsByName(String name);
}
