package com.infoxit.firstProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infoxit.firstProject.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
