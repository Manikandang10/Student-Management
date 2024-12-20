package com.example.Student.Mangement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Course")
public class Course {

    @Id
    private String Course_Name;
    private String Course_Duration;
    private int Price;

    public Course() {
    }

    public Course(String course_Name, String course_Duration, int price) {
        Course_Name = course_Name;
        Course_Duration = course_Duration;
        Price = price;
    }

    public String getCourse_Name() {
        return Course_Name;
    }

    public void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
    }

    public String getCourse_Duration() {
        return Course_Duration;
    }

    public void setCourse_Duration(String course_Duration) {
        Course_Duration = course_Duration;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
