package com.example.demo.student;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    private final StudentService studentService;
    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "")
    public List<Student> getStudents() {
        List<Student> list = studentService.getStudents();
        return list;
    }

    @PostMapping(consumes = "application/json",produces = "application/json",path = "/addStudent")
    public  Student addStudent(@RequestBody Student student)
    {
        System.out.println(student);
        studentRepository.save(student);
        return studentRepository.save(student);
    }
}
