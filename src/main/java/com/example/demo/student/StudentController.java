package com.example.demo.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(path = "/api/v1/student")
public class StudentController {

    private final StudentService studentService;
    StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping(value = "/getfile")
    public List<HashMap<String,Object>> getfiles() {
    	HashMap<String,Object> map = new HashMap<>();
    	map.put("hellooo","world");
    	List<HashMap<String,Object>> list= new ArrayList();
    	list.add(map);
         return list;
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
