package com.app.entity;

public class Student {
    private String name;
    private String father;
    private String email;
    private Integer phone;
    private String student_id;

    public Student(String name, String father, String email, Integer phone, String student_id) {
        this.name = name;
        this.father = father;
        this.email = email;
        this.phone = phone;
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", student_id='" + student_id + '\'' +
                '}';
    }
}
