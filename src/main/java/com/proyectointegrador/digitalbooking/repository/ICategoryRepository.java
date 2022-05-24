package com.proyectointegrador.digitalbooking.repository;

import com.proyectointegrador.digitalbooking.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
