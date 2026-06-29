package com.Raj.MyFirstProduct.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data// will give you getter and setter
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int price;
}
