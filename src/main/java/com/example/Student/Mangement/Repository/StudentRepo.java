package com.example.Student.Mangement.Repository;

import com.example.Student.Mangement.Model.AllStudentData;
import com.example.Student.Mangement.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<AllStudentData,Integer> {
}
