package com.accenture.training.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.training.domain.ClientsEntity;
import com.accenture.training.domain.ProductsEntity;
import com.accenture.training.dto.ClientsTO;
import com.accenture.training.dto.ProductsTO;
import com.accenture.training.repository.ClientsRepository;

@Service
public class ClientsService {
	
	@Autowired
	ClientsRepository rep;
	
	
	@Autowired
	ModelMapper mapper;


	public ClientsTO save(ClientsTO client) {
		ClientsEntity savedEntity = rep.save(mapper.map(client, ClientsEntity.class));
		return mapper.map(savedEntity, ClientsTO.class);
	}


	public List<ClientsTO> findAll(String keyword) {
		List<ClientsEntity> result = null;
		
		if (Strings.isEmpty(keyword)){
			result = rep.findAll();
		}else{
			keyword = "%"+ keyword + "%";
			result = rep.findByKeyword(keyword);
		}
		
		return result.stream().map(item ->{
			return mapper.map(item, ClientsTO.class);
		}).collect(Collectors.toList());
	}


	public ClientsTO findOne(String id) {
		Optional<ClientsEntity> oneEntity = rep.findById(id);
		return mapper.map(oneEntity.get(), ClientsTO.class);
	}


	public boolean delete(String id) {
		rep.deleteById(id);
		return true;
	}

}


