package com.stores.DailyBalancesForStores.services;

import com.stores.DailyBalancesForStores.entity.Product;

import java.util.Collection;

public interface ProductServices {

    Collection<Product> getAllProducts();
    Collection<Product> getProductsByType(String type);
}
