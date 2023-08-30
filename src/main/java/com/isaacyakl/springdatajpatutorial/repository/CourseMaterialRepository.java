package com.isaacyakl.springdatajpatutorial.repository;

import org.springframework.stereotype.Repository;

import com.isaacyakl.springdatajpatutorial.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long>{
    
}
