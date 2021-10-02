package com.project.app.controller;

import java.util.List;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.app.model.Product;
import com.project.app.repository.ProductRepository;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductRepository productrepository;
	
	// to get all the products available
	@GetMapping("getallproducts")
	public List<Product> getAllproduct()
	{
		List<Product> product = (List<Product>) productrepository.findAll();
		return product;
	}
	
	// to add a completely new product 
	@PostMapping("addproduct")
	public Product addproduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// to delete the product
	@DeleteMapping("delete/product/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		productrepository.deleteById(id);
	}
	
	// update the any product details with the particular id of that product
	@PutMapping("update/product/{id}")
	public Product updateproduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// to filter by season
	@GetMapping("filter/season/{season}")
    public List<Product> getFilteredbySeason(@PathVariable String season) {

        return productrepository.findBySeason(season);
    }
	
	// to filter by brand
	@GetMapping("filter/brand/{brand}")
    public List<Product> getFilteredbyBrand(@PathVariable String brand) {

        return productrepository.findByBrand(brand);
    }
	
	
	// to filter by category
	@GetMapping("filter/category/{category}")
	public List<Product> getFilteredbyCategory(@PathVariable String category) {

	     return productrepository.findByCategory(category);
	 }
		
		
	 // to filter by color
     @GetMapping("filter/color/{color}")
	 public List<Product> getFilteredbyColor(@PathVariable String color) {

	      return productrepository.findByColor(color);
	 }
     
     
     // to filter from low price to high price
     @GetMapping("filter/price/lowtohigh")
	 public List<Product> findByLowPrice() {

	      return productrepository.findByLowPrice();
	 }
     
     
     // to filter from high price to low price
     @GetMapping("filter/price/hightolow")
	 public List<Product> findByHighPrice() {

	      return productrepository.findByHighPrice();
	 }
     
     // to filter latest shoe of a particular brand
     @GetMapping("filter/{brand}/latest")
	 public List<Product> getFilteredLatest(@PathVariable String brand) {

	      return productrepository.findByLatest(brand);
	 }	
	
	
	
	

	
	
	
}

