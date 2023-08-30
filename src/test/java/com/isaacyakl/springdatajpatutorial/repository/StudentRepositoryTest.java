package com.isaacyakl.springdatajpatutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.isaacyakl.springdatajpatutorial.entity.Guardian;
import com.isaacyakl.springdatajpatutorial.entity.Student;

@SpringBootTest
public class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
            .emailId("shabbir@gmail.com")
            .firstName("Shabbir")
            .lastName("Dawoodi")
            // .guardianName("Nikhil")
            // .guardianEmail("nikhil@gmail.com")
            // .guardianMobile("9999999999")
            .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {
        Guardian guardian = Guardian.builder()
            .name("Nikhil")
            .email("nikhil@gmail.com")
            .mobile("9999999999")
            .build();
        Student student = Student.builder()
            .firstName("Shivam")
            .lastName("Kumar")
            .emailId("shivam@gmail.com")
            .guardian(guardian)
            .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName() {
        List<Student> students = studentRepository.findByFirstName("Shivam");
        System.out.println("studentList = " + students);
    }
    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students = studentRepository.findByGuardianName("Nikhil");
        System.out.println("students = " + students);
    }

    @Test
    public void printgetStudentByEmailAddress(){
        Student student = studentRepository.getStudentByEmailAddress("shabbir@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress(){
        String firstName = studentRepository.getStudentFirstNameByEmailAddress("shabbir@gmail.com");
        System.out.println("firstName = " + firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative(){
        Student student = studentRepository.getStudentByEmailAddressNative("shivam@gmail.com");
        System.out.println("student = " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNamedParam(){
        Student student = studentRepository.getStudentByEmailAddressNamedParam("shivam@gmail.com");
        System.out.println("student = " + student);
    }





    @Test
    public void printupdateStudentNameByEmailId(){
        studentRepository.updateStudentNameByEmailId("Shabbir Dawoodi", "shabbir@gmail.com");
    }

}
