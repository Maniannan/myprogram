package com.employee.employeeMongoOperation;

import java.io.FileInputStream;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

enum SingletonInstance {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Singleton{

     public static void main(String args[]) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {



         SingletonInstance singleton =  SingletonInstance.INSTANCE;
         //SingletonInstance singleton2 =  SingletonInstance.getSingletonInstance();
         singleton.setValue(2);


         FileOutputStream fouttream = new FileOutputStream("out.ser");
         ObjectOutputStream objectOutputStream = new ObjectOutputStream(fouttream);
         objectOutputStream.writeObject(singleton);
         objectOutputStream.close();
         fouttream.close();
         singleton.setValue(1);

         FileInputStream finstream = new FileInputStream("out.ser");
         ObjectInputStream objectInputStream = new ObjectInputStream(finstream);
         SingletonInstance newSingletonObj = (SingletonInstance)objectInputStream.readObject();
         objectInputStream.close();
         finstream.close();

        if(singleton == newSingletonObj){
            System.out.println("BOth the objects are same");
        }
         System.out.println("singleton.getValue(): " + singleton.getValue());
         System.out.println("newSingletonObj.getValue(): " + newSingletonObj.getValue());


         //Reflection Ways
         /*SingletonInstance singleton =  SingletonInstance.getSingletonInstance();
         Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
         constructor.setAccessible(true);
         SingletonInstance singleton2 = (SingletonInstance) constructor.newInstance();
         if(singleton != singleton2)
             System.out.println("Not Equals");*/


     }
}

