package com.proyectointegrador.digitalbooking.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.digitalbooking.dto.CategoryDTO;
import com.proyectointegrador.digitalbooking.entities.Category;
import com.proyectointegrador.digitalbooking.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoryService implements ICategoryService{

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    ObjectMapper mapper;

    public void saveCategory(CategoryDTO categoryDTO) {
        Category category = mapper.convertValue(categoryDTO,Category.class);
        categoryRepository.save(category);
    }

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) {
        saveCategory(categoryDTO);
        return categoryDTO;
    }

    /*@Override
    public CategoryDTO findCategory(Float id){
        Optional<Category> category =  categoryRepository.findById(id);
        CategoryDTO categoryDTO = null;
        if(category.isPresent()){
            categoryDTO = mapper.convertValue(category, CategoryDTO.class);
        }
        return categoryDTO;
    }
    */

    @Override
    public void editCategory(CategoryDTO categoryDTO) {
        saveCategory(categoryDTO);
    }

    @Override
    public void removeCategory(Float id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Set<CategoryDTO> getCategories(){
        List<Category> categories = categoryRepository.findAll();
        Set<CategoryDTO> categoriesDTO = new HashSet<>();
        for(Category category : categories){
            categoriesDTO.add(mapper.convertValue(category, CategoryDTO.class));
        }
        return categoriesDTO;
    }
}

