package com.example.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    StudentService service;

    public StudentController() {
        this.service = new StudentService();
    }

    @GetMapping("/getAllStudents")
    public List<StudentModel> getStudents() {
        List<StudentModel> allStudents = service.getAllStudents();
        return allStudents;
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody StudentModel model) {
        String result = service.saveStudent(model);
        return result;
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        String result = service.deleteStudentById(id);
        return result;
    }

    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@RequestBody StudentModel model, @PathVariable int id) {
        String result = service.updateStudent(model, id);
        return result;
    }
}

