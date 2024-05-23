package com.example.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentService {
    public static List<StudentModel> studentModelList;

    public StudentService() {
        studentModelList = new ArrayList<>();

        studentModelList.add(new StudentModel(1, "Sujit", "MUmbai"));
        studentModelList.add(new StudentModel(2, "Shubham", "Sangali"));
        studentModelList.add(new StudentModel(3, "Sahil", "Worli"));
    }

    public List<StudentModel> getAllStudents() {
        return studentModelList;
    }

    public String saveStudent(StudentModel model) {
        studentModelList.add(model);
        return "Student added to list";
    }

    public String deleteStudentById(int id) {
        Optional<StudentModel> deleteStudent = studentModelList.stream()
                .filter(student -> student.getStudentId() == id)
                .findFirst();

        if (deleteStudent.isPresent()) {
            studentModelList.remove(deleteStudent.get());
            return "Student deleted successfully...";
        } else {
            return "Student not found...";
        }
    }

    public String updateStudent(StudentModel model, int id) {
        Optional<StudentModel> updateStudent = studentModelList.stream()
                .filter(student -> student.getStudentId() == id)
                .findFirst();

        if (updateStudent.isPresent()) {
            studentModelList.remove(updateStudent.get());
            studentModelList.add(model);
            return "Student updated successfully...";
        } else {
            return "Student not updated...";
        }
    }
}
