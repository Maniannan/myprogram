package com.employee.employeeMongoOperation;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    Student(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

}


 interface Fruit{
    public String TYPE="APPLE";
}

public class MapTest implements Fruit {

    public static void main(String args[]){
        //Type="adfas";

        //below is the

        //\u000d System.out.println("HI");

        /*Student s1 = new Student(102,"Mani" );
        Student s2 = new Student(101,"Kumar" );
        Student s3 = new Student(103,"Venu" );
        Student s4 = new Student(1,"Ram" );

        Map<Student, String> unsortMap = new HashMap();
        unsortMap.put(s1,"Mani");
        unsortMap.put(s2,"Kumar");
        unsortMap.put(s3,"Venu");
        unsortMap.put(s4,"Ram");

        Map<Student,String> sortedMap = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2)

        }))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

       *//* List<Map.Entry<Integer,String>> entryList = new ArrayList<Map.Entry<Integer,String>>(unsortMap.entrySet());

        Collections.sort(entryList, new Comparator<Entry<Integer, String>>() {
            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        HashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String> mapEntry: entryList){
            sortedMap.put(mapEntry.getKey(),mapEntry.getValue());
        }
        sortedMap.entrySet().stream().forEach(a-> System.out.println(a));*//*

        sortedMap.entrySet().stream().forEach(a-> System.out.println(a));*/


    }
}
