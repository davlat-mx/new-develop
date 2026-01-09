package org.dave.comporator;

import java.util.Comparator;

public class PersonByNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person left, Person right) {
        return left.name().compareTo(right.name());
    }
}
