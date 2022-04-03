package animalStuff;

import java.util.Objects;

public class Cat extends Animal {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && Objects.equals(name, cat.name) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return 43^age + name.hashCode()^color.hashCode();
    }

    @Override
    public String toString() {
        return "This is cat named " + name + " who is " + age + " years old and he has " + color + " fur";
    }
}
