package org.dave.comporator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComporatorDevmark {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
            new Person("Alex", 30),
            new Person("Yaroslav", 20),
            new Person("Vasya", 20)
        );
        Comparator<Person> personByNameComparator = Comparator.comparing(Person::age).thenComparing(Person::name);
        persons.sort(personByNameComparator);
//        persons.sort(new PersonByNameComparator());
        System.out.println(persons);
        System.out.printf("Самый молодой: %s", Collections.min(persons));
        System.out.printf("\n Самый старый: %s", Collections.max(persons));
    }

}
