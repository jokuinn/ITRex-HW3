package com.reut.homework.stream.test;

import com.reut.homework.stream.task6.Task6;
import com.reut.homework.stream.task6.Department;
import com.reut.homework.stream.task6.Employees;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    @Test
    public void calcNumberOfEmployeesShouldReturnRightNumber() {
       final long expected = 1L;

       assertEquals(expected, Task6.calcNumberOfEmployees(departments(), 20000L));
    }
    private List<Department> departments() {
        final Employees employee = new Employees("William", 20000);
        final Employees employee1 = new Employees("Sophia", 10000);
        final Employees employee2 = new Employees("John", 50000);

        final List<Employees> employees = Arrays.asList(employee, employee1);
        final List<Employees> employees1 = List.of(employee2);

        final Department department = new Department("dep-1", "111-1", employees);
        final Department department1 = new Department("dep-2", "222-1", employees1);

        return Arrays.asList(department, department1);
    }
}
