package com.example;

import java.util.List;

public interface Repository {
    public List<Employee> readEmployees();
    public Employee createEmployee(Employee employee);
}
