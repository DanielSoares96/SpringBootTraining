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

import com.accenture.training.dto.ClientsTO;
import com.accenture.training.service.ClientsService;
//import com.sap.cloud.security.xsuaa.token.Token;

@RestController
@RequestMapping("Clients")
public class ClientsController {
	
	@Autowired
	ClientsService service;
	
	
	@PostMapping("")
	public ClientsTO createClient(@RequestBody ClientsTO client/*, @AuthenticationPrincipal Token token*/){
		return service.save(client);
	}
	
	@PutMapping("{clientId}")
	public ClientsTO updateClient(@PathVariable("clientId") String id, @RequestBody ClientsTO client/*, @AuthenticationPrincipal Token token*/){
		if(!id.equals(client.getId())){
			return new ClientsTO();
		}
		return service.save(client);
	}
	
	@GetMapping("")
	public List<ClientsTO> findAll(@RequestParam(value="keyword", required = false) String keyword/*, @AuthenticationPrincipal Token token*/){
		return service.findAll(keyword);
	}
	
	@GetMapping("{clientId}")
	public ClientsTO FindOne(@PathVariable("clientId") String id/*, @AuthenticationPrincipal Token token*/){
		return service.findOne(id);
		
	}
	
	@DeleteMapping("{clientId}")
	public String deleteProduct(@PathVariable("clientId") String id/*, @AuthenticationPrincipal Token token*/){
		return Boolean.toString(service.delete(id));
	}
	
}
