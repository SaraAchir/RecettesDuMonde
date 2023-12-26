package com.inaya.recettesDuMonde.dao;

import com.inaya.recettesDuMonde.POJO.Category;
import com.inaya.recettesDuMonde.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryDao extends JpaRepository<Category,Integer> {
    List<Category> getAllCategory();
}

