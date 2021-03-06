package com.proyectointegrador.digitalbooking.controllers;

import com.proyectointegrador.digitalbooking.dto.CategoryDTO;
import com.proyectointegrador.digitalbooking.service.interfaces.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    ICategoryService categoryService;

    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody CategoryDTO categoryDTO){
        categoryService.createCategory(categoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Category created");
    }

    @PutMapping
    public ResponseEntity<?> editCategory(@RequestBody CategoryDTO categoryDTO){
        categoryService.editCategory(categoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Category edited");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeCategory(@PathVariable Integer id){
        categoryService.removeCategory(id);
        return ResponseEntity.status(HttpStatus.CREATED).body("Category deleted");
    }

    @GetMapping
    public Collection<CategoryDTO> getAllCategories(){
        return categoryService.getCategories();
    }

}
