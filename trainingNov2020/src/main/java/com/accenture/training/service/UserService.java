package com.accenture.training.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.training.domain.UserEntity;
import com.accenture.training.dto.UserTO;
import com.accenture.training.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository rep;
	
	
	@Autowired
	ModelMapper mapper;

	
	
	
	public List<UserTO> findAll(String keyword, boolean fuzzy){
		List<UserEntity> result = null;
		
		if (Strings.isEmpty(keyword)){
		result = rep.findAll();
		}else{
			keyword = "%"+keyword+"%";
			if (fuzzy){
				result = rep.findByKeyword(keyword);
			}else{
			result = rep.findByKeyword(keyword);
			}
		}
		
		return result.stream().map(item ->{
			return mapper.map(item, UserTO.class);
		}).collect(Collectors.toList());
	}


	public UserTO save(UserTO user) {
		UserEntity savedEntity = rep.save(mapper.map(user, UserEntity.class));
		return mapper.map(savedEntity, UserTO.class);
	}

	public boolean delete(String id) {
		rep.deleteById(id);
		return true;
	}


	public UserTO findOne(String id) {
		Optional<UserEntity> oneEntity = rep.findById(id);
		return mapper.map(oneEntity.get(), UserTO.class);
		
	}


}