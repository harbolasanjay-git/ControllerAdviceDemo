package com.stech.api.controller;

import com.stech.api.model.MstProduct;
import com.stech.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<MstProduct> fetchAllProducts(){
        return productService.fetchAllProducts();
    }

    @GetMapping("/product/{productId}")
    public MstProduct getProductById(@PathVariable("productId") Integer productId){
        return productService.getProductById(productId);
    }

    @GetMapping("/productByType/{productType}")
    public List<MstProduct> fetchAllProducts(@PathVariable("productType") String productType){
        productType = "";
        return productService.getProductByType(productType);
    }
}
