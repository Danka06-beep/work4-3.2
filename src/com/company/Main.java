package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {



        Set<Student>studentSet = new HashSet<>();
        studentSet.add(new Student("Кирилл","Б-16","1"));
        studentSet.add(new Student("Елена","Б-17","2"));
        studentSet.add(new Student("Денис","Б-18","3"));

        System.out.println();
        boolean result = studentSet.add(new Student("Никита","Б-16","1"));
        if (result == false) {
            System.err.println("Ошибка! Студенческий номер должен отличатся ");
        }
        System.out.println(studentSet.toString());
    }
}
