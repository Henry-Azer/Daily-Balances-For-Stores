package com.stores.DailyBalancesForStores.repository;

import com.stores.DailyBalancesForStores.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Collection<Product> getAllByType(String type);
}
