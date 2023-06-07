package com.example.p4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name){
        return db.findByName(name);
    }

    public void addProduct(Product p) {
        db.save(p);
    }

//    public Product getProduct(String name) {
//        for (Product p :
//                products) {
//            if (p.getName().equals(name)) {
//                return p;
//            }
//        }
//
//        return null;
//
//    }
//
//    public List<Product> getProductsByPlace(String place) {
//        List<Product> toReturn = new ArrayList<>();
//
//        for (Product p :
//                products) {
//            if (p.getPlace().equals(place)) {
//                toReturn.add(p);
//            }
//        }
//
//        return toReturn;
//    }
//
//    public List<Product> getProductsWithText(String text) {
//        String str = text.toLowerCase();
//        List<Product> prods = new ArrayList<>();
//
//        for (Product p :
//                products) {
//            String name = p.getName().toLowerCase();
//            String type = p.getType().toLowerCase();
//            String place = p.getPlace().toLowerCase();
//            if (name.contains(text) || type.contains(text) || place.contains(text)) {
//                prods.add(p);
//            }
//        }
//
//        return prods;
//    }
}