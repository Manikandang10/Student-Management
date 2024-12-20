package com.example.Student.Mangement.Repository;

import com.example.Student.Mangement.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff,Integer> {
}
