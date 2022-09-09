package com.genspark.StudentManagementSystem.Controller;

import com.genspark.StudentManagementSystem.Entity.Student;
import com.genspark.StudentManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String home(){
        return "This is a simple REST API for Student Management System";
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return this.studentService.getAllStudent();
    }

    @GetMapping("/students/{studentID}")
    public Student getStudentByID(@PathVariable String studentID){
        return this.studentService.getStudentByID(Integer.parseInt(studentID));
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return this.studentService.addStudent(student);
    }


    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return this.studentService.updateStudent(student);
    }


    @DeleteMapping("/students/{studentID}")
    public String deleteStudent(@PathVariable String studentID){
        return this.studentService.deleteStudentByID(Integer.parseInt(studentID));
    }
}
