package com.proyectointegrador.digitalbooking.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "categories")
@Getter
@Setter
public class Category {

    @Id
    @SequenceGenerator(name="category_sequence", sequenceName = "category_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_sequence")
    private Float id;

    private String title;
    private String description;
    private String imgUrl;

    public Category() {
    }

    public Category(String title, String description, String imgUrl) {
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
    }



}
