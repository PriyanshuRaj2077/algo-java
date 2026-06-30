package com.Raj.MyFirstProduct.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data// will give you getter and setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;
}
