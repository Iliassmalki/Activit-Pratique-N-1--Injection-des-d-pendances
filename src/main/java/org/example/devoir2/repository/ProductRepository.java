package org.example.devoir2.repository;

import org.example.devoir2.Entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
List<Product> findByNameContains(String mc);
@Query("select p from Product p where p.name like :x")
List<Product> search(@Param("x") String mc);
    @Query("select p from Product p where p.price > :x")
    List<Product> searchByPrice(@Param("x") double price);
List<Product> findByPriceGreaterThan(String price);

}
