package org.grainger.product.repository;

import org.grainger.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
    // Product getByName(String name);
}
