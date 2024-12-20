package com.example.Student.Mangement.Services;

import com.example.Student.Mangement.Model.Staff;
import com.example.Student.Mangement.Repository.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    @Autowired
    StaffRepo repo;

    public List<Staff> getAllStaff()
    {
        return repo.findAll();
    }

    public ResponseEntity<?> AllNewStaff(Staff staff)
    {
        repo.save(staff);
        return ResponseEntity.ok("New Staff Added Successfully....");
    }

    public ResponseEntity<?> UpdateStaff(Staff staff) {
        repo.save(staff);
        return ResponseEntity.ok("Update Successfully...");
    }

    public ResponseEntity<?> deletestaff(int id) {
        repo.deleteById(id);
        return ResponseEntity.ok("Delete Successfully...");
    }
}
