package com.proyectointegrador.digitalbooking.service.interfaces;

import com.proyectointegrador.digitalbooking.dto.CategoryDTO;

import java.util.Set;

public interface ICategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    //CategoryDTO findCategory(Long id);
    void editCategory(CategoryDTO categoryDTO);
    void removeCategory(Integer id);
    Set<CategoryDTO> getCategories();
}
