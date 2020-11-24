package com.accenture.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accenture.training.domain.ClientsEntity;

public interface ClientsRepository extends JpaRepository<ClientsEntity, String>{

	@Query("Select k from ClientsEntity as k where k.name like :keyword ")
    public List<ClientsEntity> findByKeyword(@Param("keyword") String keyword);

}
