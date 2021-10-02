package com.project.app.repository;

import org.springframework.data.domain.Pageable;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;
import com.project.app.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
	   
	
	   //@Query("SELECT p from Product p")      	
	   //public List<Product> findByAll();
	   
	   @Query("SELECT p from Product p where p.season=:c")      	
	   public List<Product> findBySeason(@Param("c") String season);
	   
	   @Query("SELECT p from Product p where p.brand=:b")      	
	   public List<Product> findByBrand(@Param("b") String brand);
	   
	   @Query("SELECT p from Product p where p.category=:cg")      	
	   public List<Product> findByCategory(@Param("cg") String category);
	   
	   @Query("SELECT p from Product p where p.color=:co")      	
	   public List<Product> findByColor(@Param("co") String color);
	   
	   
	   @Query("SELECT p from Product p order by price asc")     	
	   public List<Product> findByLowPrice();
	   
	   @Query("SELECT p from Product p order by price desc")     	
	   public List<Product> findByHighPrice();
	   
	   @Query(nativeQuery = true,
		       value = "select * from product p where p.Brand=?1 order by Created_Date desc limit 0, 1")
	   public List<Product> findByLatest(String brand);
	   
	   
	   
	  
		   
	   
	
}
