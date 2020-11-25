package com.accenture.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.training.dto.ProductsTO;
import com.accenture.training.service.ProductsService;
//import com.sap.cloud.security.xsuaa.token.Token;

@RestController
@RequestMapping("Products")
public class ProductsController {

	@Autowired
	ProductsService service;
	
	@GetMapping("")
	public List<ProductsTO> findAll(@RequestParam(value="keyword", required = false) String keyword, @RequestParam(value="fuzzy", required = false) boolean fuzzy/*, @AuthenticationPrincipal Token token*/){
		return service.findAll(keyword, fuzzy);
	}
	
	@GetMapping("{productId}")
	public ProductsTO FindOne(@PathVariable("productId") String id /*, @AuthenticationPrincipal Token token*/){
		return service.findOne(id);
		
	}

	
	@PostMapping("")
	public ProductsTO createProduct(@RequestBody ProductsTO product/*, @AuthenticationPrincipal Token token*/){
		return service.save(product);
	}
	
	@PutMapping("{productId}")
	public ProductsTO updateProduct(@PathVariable("productId") String id, @RequestBody ProductsTO product/*, @AuthenticationPrincipal Token token*/){
		if(!id.equals(product.getId())){
			return new ProductsTO();
		}
		return service.save(product);
	}
	
	@DeleteMapping("{productId}")
	public String deleteProduct(@PathVariable("productId") String id/*, @AuthenticationPrincipal Token token*/){
		return Boolean.toString(service.delete(id));
	}
	
}
