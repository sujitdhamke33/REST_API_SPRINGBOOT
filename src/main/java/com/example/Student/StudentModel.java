package com.example.Student;

public class StudentModel {
    private int studentId;
    private String studentName;
    private String studentCity;

    public StudentModel() {
        super();
    }

    public StudentModel(int studentId, String studentName, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }
}

