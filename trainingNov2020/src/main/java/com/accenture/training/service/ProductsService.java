package com.accenture.training.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.training.domain.ProductsEntity;
import com.accenture.training.dto.ProductsTO;
import com.accenture.training.repository.ProductsRepository;

@Service
public class ProductsService {
	
	@Autowired
	ProductsRepository rep;
	
	
	@Autowired
	ModelMapper mapper;

	
	
	
	public List<ProductsTO> findAll(String keyword, boolean fuzzy){
		List<ProductsEntity> result = null;
		
		if (Strings.isEmpty(keyword)){
		result = rep.findAll();
		}else{
			keyword = "%"+keyword+"%";
			if (fuzzy){
				result = rep.findByKeywordWithFuzzy(keyword);
			}else{
			result = rep.findByKeyword(keyword);
			}
		}
		
		return result.stream().map(item ->{
			return mapper.map(item, ProductsTO.class);
		}).collect(Collectors.toList());
	}


	public ProductsTO save(ProductsTO product) {
		ProductsEntity savedEntity = rep.save(mapper.map(product, ProductsEntity.class));
		return mapper.map(savedEntity, ProductsTO.class);
	}

	public boolean delete(String id) {
		rep.deleteById(id);
		return true;
	}


	public ProductsTO findOne(String id) {
		Optional<ProductsEntity> oneEntity = rep.findById(id);
		return mapper.map(oneEntity.get(), ProductsTO.class);
		
	}


}
