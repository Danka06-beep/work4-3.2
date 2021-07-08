package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите информацию о студенте: \"Имя, номер группы, номер студенческого билета\"");
        Set<Student> studentSet = new HashSet<>();
        while (true) {
            System.out.println("Введите информацию о студенте");
            String name = sc.nextLine();
            String group = sc.nextLine();
            String StudentId = sc.nextLine();

            Student st = new Student(name, group, StudentId);
            studentSet.add(st);

            System.out.println("Если хотите закончить ввод данных, введите end (для продолжения введите любую клавишу)");
            String input = sc.nextLine();
            if ("end".equals(input))
                break;{
            }
            }
        System.out.println("Список студентов:" + studentSet);

        }
    }


/* Set<Student>studentSet = new HashSet<>();
        studentSet.add(new Student("Кирилл","Б-16","1"));
        studentSet.add(new Student("Елена","Б-17","2"));
        studentSet.add(new Student("Денис","Б-18","3"));

        System.out.println();
        boolean result = studentSet.add(new Student("Никита","Б-16","1"));
        if (result == false) {
            System.err.println("Ошибка! Студенческий номер должен отличатся ");
        }
        System.out.println(studentSet.toString());*/