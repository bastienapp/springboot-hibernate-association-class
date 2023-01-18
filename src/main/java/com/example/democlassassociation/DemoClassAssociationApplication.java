package com.example.democlassassociation;

import com.example.democlassassociation.entity.Course;
import com.example.democlassassociation.entity.Enrollment;
import com.example.democlassassociation.entity.Student;
import com.example.democlassassociation.repository.CourseRepository;
import com.example.democlassassociation.repository.EnrollmentRepository;
import com.example.democlassassociation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DemoClassAssociationApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoClassAssociationApplication.class, args);
    }

    @Override
    public void run(String... args) {

        Student michel = studentRepository.save(new Student("Michel", "Durand"));

        Course java = courseRepository.save(new Course("Java"));
        Course springBoot = courseRepository.save(new Course("Spring Boot"));

        enrollmentRepository.save(new Enrollment(michel, java, new Date()));
        enrollmentRepository.save(new Enrollment(michel, springBoot, new Date()));
    }
}
