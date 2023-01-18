package com.example.democlassassociation.repository;

import com.example.democlassassociation.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
