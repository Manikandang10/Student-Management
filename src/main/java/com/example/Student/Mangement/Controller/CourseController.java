package com.example.Student.Mangement.Controller;

import com.example.Student.Mangement.Model.Course;
import com.example.Student.Mangement.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService service;

    @GetMapping("")
    public List<Course> getallCourse()
    {
        return service.GetAllCourse();
    }

    @PostMapping("/addCourse")
    public ResponseEntity<?> AddNewCourse(@RequestBody Course course)
    {
       return service.AllNewCourse(course);
    }

    @DeleteMapping("/delete/{Name}")
    public ResponseEntity<?> deleteCourse(@PathVariable String Name)
    {
        return service.RemoveCourse(Name);
    }

    @PutMapping("/update")
    public ResponseEntity<?> UpdateCourse(@RequestBody Course course)
    {
        return service.UpdateCourse(course);

    }
}
