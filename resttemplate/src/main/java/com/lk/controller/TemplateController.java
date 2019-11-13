package com.lk.controller;

import com.lk.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class TemplateController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll()
    {
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id")long id)
    {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student)
    {
        restTemplate.postForObject("http://localhost:8010/student/save",student,int.class);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")long id)
    {
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
    }

}
