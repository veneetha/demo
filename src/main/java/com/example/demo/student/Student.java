package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",sequenceName = "student_sequence")
    @GeneratedValue(generator = "student_sequence",strategy = GenerationType.SEQUENCE)
    private  Long id;
    @Column(name = "name",nullable = false)
    private  String name;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "age")
    private Integer age;
    @Column(name = "email")
    private  String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
public Student(){

}
   /* public Student(Long id, String name, LocalDate dob, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, LocalDate dob, Integer age, String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
