package com.example.Student.Mangement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Teaching_Staff")
public class Staff {

    @Id
    private int Staff_Id;
    private String Name;
    private String Qualification;
    private String Exp;

    public Staff() {
    }

    public Staff(int staff_Id, String name, String qualification, String exp) {
        Staff_Id = staff_Id;
        Name = name;
        Qualification = qualification;
        Exp = exp;
    }

    public int getStaff_Id() {
        return Staff_Id;
    }

    public void setStaff_Id(int staff_Id) {
        Staff_Id = staff_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        Qualification = qualification;
    }

    public String getExp() {
        return Exp;
    }

    public void setExp(String exp) {
        Exp = exp;
    }
}
