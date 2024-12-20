package com.example.Student.Mangement.Services;

import com.example.Student.Mangement.Model.Admin;
import com.example.Student.Mangement.Repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminRepo repo;

    public List<Admin> GetAllAdmin()
    {
        return repo.findAll();
    }

    public ResponseEntity<?> AddNewAdmin(Admin admin)
    {
        repo.save(admin);
        return ResponseEntity.ok("Admin Added Successfully......");
    }

    public ResponseEntity<?> UpdateAdmin(Admin admin)
    {
        repo.save(admin);
        return ResponseEntity.ok("Admin Update Successfully......");
    }

    public ResponseEntity<?> removeAdmin(String name)
    {
        repo.deleteAdmin(name);
        return ResponseEntity.ok("Admin Added Successfully......");
    }
}
