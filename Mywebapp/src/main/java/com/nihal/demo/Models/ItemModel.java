package com.nihal.demo.Models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemModel {
    @Id
    private int id;
    // todo: remove id
    private String name;

    public String image;

    private float price;

    private String category;

    public int quantity;

}

//extends this class to a ineterface for repository