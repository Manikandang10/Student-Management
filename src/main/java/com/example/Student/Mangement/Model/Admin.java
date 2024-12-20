package com.example.Student.Mangement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "AdminData")
public class Admin {

    @Id
    private int Username;
    private String Password;

    public Admin(int username, String password) {
        Username = username;
        Password = password;
    }

    public Admin() {
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getUsername() {
        return Username;
    }

    public void setUsername(int username) {
        Username = username;
    }
}
