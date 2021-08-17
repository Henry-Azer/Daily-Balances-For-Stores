package com.stores.DailyBalancesForStores.services;

import com.stores.DailyBalancesForStores.entity.Product;
import com.stores.DailyBalancesForStores.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ProductServiceImpl implements ProductServices{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Collection<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Collection<Product> getProductsByType(String type) {
        return productRepository.getAllByType(type);
    }
}
