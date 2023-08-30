package com.isaacyakl.springdatajpatutorial.repository;

import org.springframework.stereotype.Repository;

import com.isaacyakl.springdatajpatutorial.entity.Course;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    Page<Course> findByTitleContaining(String title, Pageable pageRequest);
}
