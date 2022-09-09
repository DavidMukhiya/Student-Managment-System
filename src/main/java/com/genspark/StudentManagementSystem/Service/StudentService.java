package com.genspark.StudentManagementSystem.Service;

import com.genspark.StudentManagementSystem.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();
    Student getStudentByID(int studentID);
    Student addStudent(Student student);
    Student updateStudent(Student student);
    String deleteStudentByID(int studentID);


}
