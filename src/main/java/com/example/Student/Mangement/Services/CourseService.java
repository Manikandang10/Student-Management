package com.example.Student.Mangement.Services;

import com.example.Student.Mangement.Model.Course;
import com.example.Student.Mangement.Repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    CourseRepo repo;

    public List<Course> GetAllCourse()
    {
        return repo.findAll();
    }

    public ResponseEntity<?> AllNewCourse(Course course)
    {
        Course d=repo.save(course);
        if(d.getCourse_Name()!="")
            return ResponseEntity.ok("Course Successfully Added.....");

        return ResponseEntity.ok("Course Not Added.....");
    }

    public ResponseEntity<?> RemoveCourse(String Name)
    {
       int a= repo.deleteCourse(Name);
       if(a>0)
        return ResponseEntity.ok("Successfully Removed.....");

       return ResponseEntity.ok("Not removed.....");
    }

    public ResponseEntity<?> UpdateCourse(Course course)
    {
        repo.save(course);

        return ResponseEntity.ok("Update Successfully.......");
    }
}
