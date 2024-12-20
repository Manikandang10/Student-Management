package com.example.Student.Mangement.Model;

public class Combine {

    private int Student_id;
    private String Name;
    private int Age;
    private String Gender;
    private String Qualification;
    private String Course;
    private String Staff;

    public Combine() {
    }

    public Combine(int student_id, String name, int age, String gender, String qualification, String course, String staff) {
        Student_id = student_id;
        Name = name;
        Age = age;
        Gender = gender;
        Qualification = qualification;
        Course = course;
        Staff = staff;
    }

    public int getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(int student_id) {
        Student_id = student_id;
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

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public String getStaff() {
        return Staff;
    }

    public void setStaff(String staff) {
        Staff = staff;
    }
}
