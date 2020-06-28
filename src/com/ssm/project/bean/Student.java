package com.ssm.project.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    //DESC student;
    //+----------+-------------+------+-----+---------+----------------+
    //| Field    | Type        | Null | Key | Default | Extra          |
    //+----------+-------------+------+-----+---------+----------------+
    //| id       | int(11)     | NO   | PRI | NULL    | auto_increment |
    //| name     | varchar(20) | YES  |     | NULL    |                |
    //| sex      | varchar(2)  | YES  |     | NULL    |                |
    //| age      | int(20)     | YES  |     | NULL    |                |
    //| birthday | date        | YES  |     | NULL    |                |
    //| salary   | double(8,2) | YES  |     | NULL    |                |
    //+----------+-------------+------+-----+---------+----------------+
    int id;
    String name;
    String sex;
    int age;
    Date birthday;
    double salary;

    public Student(){}

    public Student(String name, String sex, int age, Date birthday, double salary) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                ", salary=" + salary +
                '}';
    }
}
