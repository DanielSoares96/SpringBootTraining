package com.accenture.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accenture.training.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{

	@Query("Select k from ProductsEntity as k where k.name like :keyword ")
    public List<UserEntity> findByKeyword(@Param("keyword") String keyword);
}
