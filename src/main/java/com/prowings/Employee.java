package com.prowings;

public class Employee {
    int eId;
    String name;
    String gender;
    double salary;
    String department;
    String  city;



    public Employee() {
    }

    public Employee(int eId, String name, String gender, double salary, String department, String city) {
        this.eId = eId;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


