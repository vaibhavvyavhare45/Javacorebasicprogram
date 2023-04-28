package com.prowings;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import com.prowings.Employee;
public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> al=new ArrayList<Employee>();
        al.add(new Employee(1001,"vaibhav vyavhare","male",45000.00,"IT","washim"));
        al.add(new Employee(1002,"pranav ketgale","male",60000.00,"NETWORKING","pune"));
        al.add(new Employee(1003,"marish mokal","male",55000.00,"HR","raygad"));
        al.add(new Employee(1004,"vishwajit rhaykar","male",54000.00,"IT","kolhapur"));
        al.add(new Employee(1005,"kasturi","female",44000,"IT","Amravati"));
        al.add(new Employee(1006,"kalyani","female",50000,"Account","Nagpur"));

        //java
        List<Employee> highSal= al.stream().filter(e1 ->e1.salary>50000.00).collect(Collectors.toList());
        System.out.println(highSal);

        List l=al.stream().filter(e->e.name=="vaibhav vyavhare").collect(Collectors.toList());
        System.out.println(l);

        List<Employee> esal=al.stream().filter(e->e.salary>=55000.00).collect(Collectors.toList());
        System.out.println(esal);

        Comparator<Employee> comparator=Comparator.comparing(Employee::getCity);
        Set<Employee> sortedEmpCity=al.stream().sorted(comparator).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(sortedEmpCity);

        al.forEach(e-> System.out.println(e.getName()+" "+e.getSalary()+" "));

        al.forEach(e-> e.setName(e.getName().toUpperCase()));
        System.out.println(al);

        al.forEach(e->e.setSalary(e.getSalary()+10000));
        System.out.println(al);

        Optional<Employee> maxSal=al.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(maxSal);




        Optional<Employee> minSal=al.stream().min(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(minSal);

        //sum of salary
        double sumOfSal=al.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("sumOfSal "+sumOfSal);

        Comparator<Employee> comparator1=Comparator.comparingDouble(Employee::getSalary).reversed();
        List<Employee> descSalOrder=al.stream().sorted(comparator1).collect(Collectors.toList());
        System.out.println(descSalOrder);

        double avgOfSal=al.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("avgOfSal ="+ avgOfSal);

        Map<String,Double> avgSal=al.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avgSal);


       List<Employee> sortedEmployeeById=al.stream().sorted(Comparator.comparing(e->e.geteId())).collect(Collectors.toList());
        System.out.println(sortedEmployeeById);

        List<Employee> descSortedEmpById=al.stream().sorted(Comparator.comparing(Employee::geteId,Comparator.reverseOrder())).collect(Collectors.toList());
        System.out.println(descSortedEmpById);

    }
}
