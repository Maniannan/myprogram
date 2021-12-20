package com.employee.employeeMongoOperation;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    Integer id;
    String name;
    public Employee(Integer id, String name){
            this.id = id;
            this.name = name;
        }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args){

        List<Integer> integerList = Stream.of(5,10,25,30,22,25).distinct().collect(Collectors.toList());
       // integerList.forEach(System.out::println);



    }





}
