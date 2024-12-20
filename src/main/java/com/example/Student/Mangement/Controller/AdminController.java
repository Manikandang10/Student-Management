package com.example.Student.Mangement.Controller;

import com.example.Student.Mangement.Model.Admin;
import com.example.Student.Mangement.Model.Course;
import com.example.Student.Mangement.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Admin")
public class AdminController  {

    @Autowired
    AdminService service;

    @GetMapping("")
    public List<Admin> getall()
    {
        return service.GetAllAdmin();
    }

    @PostMapping("/addAdmin")
    public ResponseEntity<?> AddNewCourse(@RequestBody Admin admin)
    {
        return service.AddNewAdmin(admin);
    }

    @DeleteMapping("/delete/{username}")
    public ResponseEntity<?> deleteCourse(@PathVariable String username)
    {
        return service.removeAdmin(username);
    }

    @PutMapping("/update")
    public ResponseEntity<?> UpdateCourse(@RequestBody Admin admin)
    {
        return service.UpdateAdmin(admin);

    }
}
