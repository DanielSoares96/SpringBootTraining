package com.accenture.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accenture.training.domain.SalesOrderEntity;

public interface SalesOrderRepository extends JpaRepository<SalesOrderEntity, String>{

	@Query("Select k from SalesOrderEntity as k where k.createdBY like :keyword")
    public List<SalesOrderEntity> findByKeyword(@Param("keyword") String keyword);

}
