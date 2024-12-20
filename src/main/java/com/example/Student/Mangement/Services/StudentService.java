package com.example.Student.Mangement.Services;

import com.example.Student.Mangement.Model.AllStudentData;
import com.example.Student.Mangement.Model.Combine;
import com.example.Student.Mangement.Model.Students;
import com.example.Student.Mangement.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public List<Combine> getAllStudent()
    {
        List<AllStudentData> AllData=repo.findAll();
        return AllData.stream().map(allStudentData -> new Combine(
            allStudentData.getStudents().getStudent_Id(),
            allStudentData.getStudents().getName(),
            allStudentData.getStudents().getAge(),
            allStudentData.getStudents().getGender(),
            allStudentData.getStudents().getQualification(),
            allStudentData.getCourse().getCourse_Name(),
            allStudentData.getStaff().getName()
        )).collect(Collectors.toList());
    }


}
