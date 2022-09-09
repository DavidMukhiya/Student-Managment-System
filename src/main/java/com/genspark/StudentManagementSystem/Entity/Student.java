package com.genspark.StudentManagementSystem.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tbl_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentID;
    private String stdName;
    private String faculty;

    public Student() {
    }

    public Student(String stdName, String faculty) {
        this.stdName = stdName;
        this.faculty = faculty;
    }

    public int getStudentID() {
        return studentID;
    }


    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
