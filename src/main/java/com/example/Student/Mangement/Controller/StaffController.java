package com.example.Student.Mangement.Controller;


import com.example.Student.Mangement.Model.Staff;
import com.example.Student.Mangement.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Staff")
public class StaffController {

    @Autowired
    StaffService service;

    @GetMapping("")
    public List<Staff> getAllStaff()
    {
        return service.getAllStaff();
    }

    @PostMapping("/Addstaff")
    public ResponseEntity<?> AddStaff(@RequestBody Staff staff)
    {
        return service.AllNewStaff(staff);
    }

    @PutMapping("/UpdateStaff")
    public ResponseEntity<?> UpdateStaff(@RequestBody Staff staff)
    {
        return service.UpdateStaff(staff);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStaff(@PathVariable int id)
    {
        return service.deletestaff(id);
    }
}
