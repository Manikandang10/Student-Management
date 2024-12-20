package com.example.Student.Mangement.Repository;

import com.example.Student.Mangement.Model.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,String> {


    @Modifying
    @Transactional
    @Query(value = "delete from course where course_name= :name", nativeQuery = true)
    int deleteCourse(@Param("name") String name);

}
