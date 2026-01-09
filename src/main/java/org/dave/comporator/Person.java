package org.dave.comporator;

public record Person(
    String name,
    int age
) implements Comparable<Person> {
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

}
