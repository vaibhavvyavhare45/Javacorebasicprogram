package com.prowings.interviewprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo1 {
    public static void main(String[] args) {
        List<Employee1> li = new ArrayList<>();
        li.add(new Employee1("vaibhav", 24, 50000));
        li.add(new Employee1("suyash", 25, 60000));
        li.add(new Employee1("rahul", 18, 40000));
        li.add(new Employee1("pranav", 26, 66000));

        List<Employee1> incrementedSal = li.stream().map(n -> {
            if (n.age > 25) {
                n.setSalary(n.getSalary() * 110 / 100);
            }
            return n;
        }).collect(Collectors.toList());
        System.out.println(incrementedSal);
    }
}
