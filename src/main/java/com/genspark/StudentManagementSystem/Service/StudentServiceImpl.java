package com.genspark.StudentManagementSystem.Service;

import com.genspark.StudentManagementSystem.Dao.StudentDao;
import com.genspark.StudentManagementSystem.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return this.studentDao.findAll();
    }

    @Override
    public Student getStudentByID(int studentID) {
        Student student = null;
        Optional<Student> std = this.studentDao.findById(studentID);
        if(std.isPresent()){
            student = std.get();
        }else{
            throw new RuntimeException("Student not found for ID :: " + studentID);
        }
        return student;
    }

    @Override
    public Student addStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return this.studentDao.save(student);
    }

    @Override
    public String deleteStudentByID(int studentID) {
        this.studentDao.deleteById(studentID);
        return "Deleted Sucessfully";
    }
}
