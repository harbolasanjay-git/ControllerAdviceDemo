package com.stech.api.service;

import com.stech.api.EmptyInputExceptions;
import com.stech.api.model.MstProduct;
import com.stech.api.repository.MstProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private MstProductRepository repository;

    @Override
    public List<MstProduct> fetchAllProducts() {
        return repository.findAll();
    }

    @Override
    public MstProduct getProductById(Integer productId) {
        Optional<MstProduct> productsById = repository.findById(productId);
        return productsById.orElseGet(MstProduct::new);
    }

    @Override
    public List<MstProduct> getProductByType(String productType) {
        if (productType.isEmpty())
            throw new EmptyInputExceptions();
        List<MstProduct> products = repository.findByProductType(productType);
        if(products.isEmpty())
            throw new NoSuchElementException(productType);
        return products;
    }
}
