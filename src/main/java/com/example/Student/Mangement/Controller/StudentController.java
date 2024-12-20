package com.example.Student.Mangement.Controller;

import com.example.Student.Mangement.Model.Combine;
import com.example.Student.Mangement.Model.Students;
import com.example.Student.Mangement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;


    @GetMapping("/")
    public List<Combine> getAllStudent()
    {
        return service.getAllStudent();
    }

    @GetMapping("/{id}")
    public List<Combine> GetSingleStudent(@PathVariable int id)
    {
        return null;
    }
}
