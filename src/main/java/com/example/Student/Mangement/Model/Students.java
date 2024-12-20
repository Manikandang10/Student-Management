package com.example.Student.Mangement.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Student_Id;
    private String Name;
    private int Age;
    private String Gender;
    private String Qualification;
    private long Contact;

    public Students() {
    }

    public Students(int student_Id, String name, int age, String gender, String qualification, long contact) {
        Student_Id = student_Id;
        Name = name;
        Age = age;
        Gender = gender;
        Qualification = qualification;
        Contact = contact;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long contact) {
        Contact = contact;
    }

    public int getStudent_Id() {
        return Student_Id;
    }

    public void setStudent_Id(int student_Id) {
        Student_Id = student_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }
}
