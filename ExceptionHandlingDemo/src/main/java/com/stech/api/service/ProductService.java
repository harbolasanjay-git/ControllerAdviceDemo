package com.stech.api.service;

import com.stech.api.model.MstProduct;

import java.util.List;

public interface ProductService {
    public List<MstProduct> fetchAllProducts ();
    public MstProduct getProductById(Integer productId);
    public List<MstProduct> getProductByType(String productType);
}
