package com.lk.dao;

import com.lk.entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentDao {
    Collection<Student> findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void delete(long id);
}
