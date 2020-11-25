package com.accenture.training.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.logging.log4j.util.Strings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.training.domain.SalesOrderEntity;
import com.accenture.training.dto.SalesOrderItemTO;
import com.accenture.training.dto.SalesOrderTO;
import com.accenture.training.repository.SalesOrderRepository;

@Service
public class SalesOrderService {
	
	@Autowired
	SalesOrderRepository rep;
	
	
	@Autowired
	ModelMapper mapper;

	
	
	
	public List<SalesOrderTO> findAll(String keyword, boolean fuzzy){
		List<SalesOrderEntity> result = null;
		
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
			SalesOrderTO salesOrder = mapper.map(item, SalesOrderTO.class);
			
			List<SalesOrderItemTO> collect = item.getItems().stream().map(SalesOrderItem -> {
				return mapper.map(SalesOrderItem, SalesOrderItemTO.class);
			}).collect(Collectors.toList());
			
			salesOrder.setSalesOrderItems(collect);
			
			return salesOrder;
		}).collect(Collectors.toList());
	}


	public SalesOrderTO save(SalesOrderTO salesOrder) {
		SalesOrderEntity savedEntity = rep.save(mapper.map(salesOrder, SalesOrderEntity.class));
		return mapper.map(savedEntity, SalesOrderTO.class);
	}

	public boolean delete(String id) {
		rep.deleteById(id);
		return true;
	}


	public SalesOrderTO findOne(String id) {
		Optional<SalesOrderEntity> oneEntity = rep.findById(id);
		return mapper.map(oneEntity.get(), SalesOrderTO.class);
		
	}

}
