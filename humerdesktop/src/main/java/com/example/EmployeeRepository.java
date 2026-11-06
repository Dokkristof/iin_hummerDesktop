package com.example;

import hu.szit.resclient.ResClient;
import hu.szit.resclient.ResConvert;
import java.util.List;

public class EmployeeRepository implements Repository {

    private final String host = "http://localhost:8000/api/employees";

    @Override
    public List<Employee> readEmployees() {
        String url = host;
        ResClient client = new ResClient();
        String result = client.get(url);
        EmployeeResult res = ResConvert.toObject(result, EmployeeResult.class);
        return res.data;
    }

    @Override
    public Employee createEmployee(Employee employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

    
}
