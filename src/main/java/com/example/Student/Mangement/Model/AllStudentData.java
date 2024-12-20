package com.example.Student.Mangement.Model;

import jakarta.persistence.*;

@Entity
@Table
public class AllStudentData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Students students;

    @ManyToOne
    private Course course;

    @ManyToOne
    private Staff staff;

    public AllStudentData(int id, Students students, Course course, Staff staff) {
        this.id = id;
        this.students = students;
        this.course = course;
        this.staff = staff;
    }

    public AllStudentData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
