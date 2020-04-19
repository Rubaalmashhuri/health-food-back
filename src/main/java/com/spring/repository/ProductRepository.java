package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Product;

import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByProductid(int productid);

	void deleteByProductid(int productid);

	List<Product> findProductsByCategory(String category);

	List<Product> findProductsByManufacturer(String manufacurer);

	List<Product> findProductsByProductname(String productName);
}
