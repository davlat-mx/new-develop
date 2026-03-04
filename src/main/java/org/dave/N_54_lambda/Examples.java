package org.dave.N_54_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(7));

        //ex2
        List<Student> students = new ArrayList<>();
        students.add(new Student(435, "Mike", 20));
        students.add(new Student(553, "steva", 22));
        students.add(new Student(123, "John", 16));

        students.sort((s1, s2) -> s1.getAge() - s2.getAge());
//        students.forEach(student -> System.out.println(student));
        students.forEach(System.out::println);
        students.removeIf(student -> student.getAge() < 18);
        System.out.println(students);
    }

    static class Student {
        int id;
        String name;
        int age;

        public Student(int id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
        }
    }

}
