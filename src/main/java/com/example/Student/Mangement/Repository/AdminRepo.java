package com.example.Student.Mangement.Repository;

import com.example.Student.Mangement.Model.Admin;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepo extends JpaRepository<Admin,String> {

    @Modifying
    @Transactional
    @Query(value = "delete from admin_data where username= :name",nativeQuery = true)
    void deleteAdmin(@Param("name") String name);
}
