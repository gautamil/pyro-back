package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectointegrador.digitalbooking.dto.CategoryDTO;
import com.proyectointegrador.digitalbooking.entities.Category;
import com.proyectointegrador.digitalbooking.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service

public class CategoryService implements ICategoryService {
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

//    @Override
//    public CategoryDTO readCategory(Float id) {
//        Optional<Category> category = categoryRepository.findById(id);
//        CategoryDTO categoryDTO = null;
//        if(category.isPresent()) {
//            categoryDTO = mapper.convertValue(category, categoryDTO.class);
//        }
//        return categoryDTO;
//    }

    @Override
    public void editCategory(CategoryDTO categoryDTO) {
        saveCategory(categoryDTO);
    }

    @Override
    public void removeCategory(Float id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public CategoryDTO readCategory(Long id) {
        return null;
    }

}





