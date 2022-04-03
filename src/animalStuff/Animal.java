package animalStuff;

public abstract class Animal {
    String name;
    int age;

    public abstract boolean equals(Object o);

    public abstract int hashCode();
}
