package service;

import com.proyectointegrador.digitalbooking.dto.CategoryDTO;

public interface ICategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO readCategory(Long id);
    void editCategory(CategoryDTO categoryDTO);
    void removeCategory(Float id);
    //Set<CategoryDTO> getCategory();
}