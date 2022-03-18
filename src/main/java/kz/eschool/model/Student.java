package kz.eschool.model;

import java.io.Serializable;

public class Student implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private int course;
    private String direction;
    private double gpa;

    public Student (){}

    public Student(Long id, String name, String surname, int course, String direction, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.direction = direction;
        this.gpa = gpa;
    }

    public Student(String name, String surname, int course, String direction, double gpa) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.direction = direction;
        this.gpa = gpa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
