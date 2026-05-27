package com.test.SpringBootApi.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.SpringBootApi.domain.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
