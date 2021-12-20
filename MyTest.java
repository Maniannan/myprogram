package com.employee.employeeMongoOperation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class MyTest {
        public static void main(String args[]){
        int[] intArray = new int[]{-8,0,2,-2,100,1};
        List<Integer>  wrapperList = new ArrayList();
        for(int i=0; i< intArray.length;i++ ){
            wrapperList.add(intArray[i]);
        }
       List<Integer> sortedInteger  = wrapperList.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).collect(Collectors.toList());
          sortedInteger.subList(0,sortedInteger.size()/2).stream().forEach(e->{
              System.out.print(e + ",");
          });
          System.out.println("\n");
          sortedInteger.subList(sortedInteger.size()/2,sortedInteger.size()).stream().forEach(e->{
              System.out.print(e + ",");
          });


    }
}
//int array = [-8,0,2,-2,100,1]
//output -8, -2, 0
// 1, 2, 100