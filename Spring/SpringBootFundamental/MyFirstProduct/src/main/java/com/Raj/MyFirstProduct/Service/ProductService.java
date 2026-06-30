package com.Raj.MyFirstProduct.Service;

import com.Raj.MyFirstProduct.model.Product;
import com.Raj.MyFirstProduct.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"Iphone",50000),
//            new Product(102,"Camera",70000)));

    public List<Product> getProducts(){
        return repo.findAll();

    }

    public Product getProductId(int prodId) {
//        return products.stream()
//                .filter(p ->p.getProdId() == prodId )
//                .findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index =0 ;
//        for(int i = 0 ; i < products.size(); i ++)
//            if(products.get(i).getProdId() == prod.getProdId())
//                index = i;
//        products.set(index ,prod);
        repo.save(prod);//there is no any specific method to update so we will use save for both saving
        // and uopdateing it wuill checvk for data if its not there it will create for you
    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for(int i = 0 ; i < products.size(); i ++) {
//            if (products.get(i).getProdId() == prodId) {
//                index = i;
//            }
//        }
//        products.remove(index);
        repo.deleteById(prodId);
    }
}
