package com.employee.employeeMongoOperation;
import java.util.function.Function;
import java.util.stream.*;
import java.util.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiagonalMatrix {
    public static void main(String args[]){
        String[] test = {"hello","how", "are", "you","hello","how"};
        List<String> list = new ArrayList<>(Arrays.asList(test));


        Map<String,Long> listMap = list.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       LinkedHashMap<String,Long> lmap = listMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry s : lmap.entrySet()) {
            System.out.println(s.getKey() + " : " + s.getValue());
        }

    }
}
