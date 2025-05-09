package com.university.dao;

import com.university.model.Course;
import java.util.*;

public class CourseDAO {
    public List<Course> getAllCourses() {
        // Mock data
        List<Course> list = new ArrayList<>();
        list.add(new Course(1, "Java Programming"));
        list.add(new Course(2, "Web Development"));
        return list;
    }
}
