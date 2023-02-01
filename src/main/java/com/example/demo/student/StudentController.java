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
    	List<HashMap<String,Object>> mainlist= new ArrayList();
    	HashMap<String,Object> maplist = new HashMap<>();
    	HashMap<String,Object> map = new HashMap<>();
    	map.put("hellooo","world");
    	map.put("lineNo", "33");
    	map.put("message", "HardCodedSensitiveValue");
    	map.put("code","public static final String PARAM_HOST_DESCRIPTION = \"The domain name or the IP address of the data server\";");
    	List<HashMap<String,Object>> list= new ArrayList();
    	list.add(map);
    	maplist.put("findings",list);
    	maplist.put("fileName", "DataSourceConnector.java");
    	mainlist.add(maplist);
         return mainlist;
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
