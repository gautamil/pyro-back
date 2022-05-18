package com.proyectointegrador.digitalbooking.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDTO {
    private String title;
    private String description;
    private String imgUrl;

    public CategoryDTO(){
    }

}
