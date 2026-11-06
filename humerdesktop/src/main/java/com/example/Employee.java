package com.example;

public class Employee {
    private Integer id;
    private String name;
    private String city;
    private Integer salary;

    public Employee() {
    }

    public Employee(Integer id, String name, String city, Integer salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
