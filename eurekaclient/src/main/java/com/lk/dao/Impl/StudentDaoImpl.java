package com.lk.dao.Impl;

import com.lk.dao.StudentDao;
import com.lk.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map<Long,Student> studentMap;

    static{
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",20));
        studentMap.put(2L,new Student(2L,"李四",22));
        studentMap.put(3L,new Student(3L,"王五",18));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void delete(long id) {
        studentMap.remove(id);
    }
}
