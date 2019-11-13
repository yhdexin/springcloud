package com.lk.controller;

import com.lk.dao.Impl.StudentDaoImpl;
import com.lk.dao.StudentDao;
import com.lk.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @GetMapping("/findAll")
    public Collection<Student> findAll()
    {
        return studentDao.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id)
    {
        return studentDao.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student)
    {
        studentDao.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student)
    {
        studentDao.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") long id)
    {
        studentDao.delete(id);
    }
}
