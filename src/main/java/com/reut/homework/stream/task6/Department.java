package com.reut.homework.stream.task6;

import com.reut.homework.stream.task6.Employees;

import java.util.List;

public class Department {
    private String name;
    private String code;
    private List<Employees> employees;

    public Department(String name, String code, List<Employees> employees) {
        this.name = name;
        this.code = code;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }
}
