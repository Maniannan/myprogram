package com.employee.employeeMongoOperation;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class EmployeeMongoOperationApplication
				{

					public static void main(String[] args) {
						SpringApplication.run(EmployeeMongoOperationApplication.class, args);
					}
					{


						String integers ="1, 3, 5, 6, 10, 4, 15, 9,,16,,, 20,, 30, 20, 25";
						List<Integer> numbers = Arrays.stream(integers.split(",")).filter(a ->!a.isEmpty()).map(String::trim).map(Integer::valueOf).collect(Collectors.toList());
						Comparator<Integer> c = (I1,I2)-> I1<I2?-1:(I1>I2?1:0);
						  Collections.sort(numbers,c);
							for(int i=0;i<numbers.size();i++){
							for(int j=i+1;j<numbers.size();j++){
								int num = numbers.get(i)+ numbers.get(j);
								if(num == 9) {
									System.out.println("index" + i + ":" + j);
								}
							}
						}
					}
				}
