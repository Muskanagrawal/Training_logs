package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/products")
    public  List<Product> findAllProducts(){
        return  service.getProducts();
    }
    @GetMapping("/product/id")
    public  Product findAllProductById(@PathVariable int id){
        return  service.getProductById(id);
    }
    @GetMapping("/product/name")
    public  Product findAllProductByName(@PathVariable String name){
        return  service.getProductByName(name);
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/id")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
