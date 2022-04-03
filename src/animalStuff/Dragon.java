package animalStuff;

public class Dragon extends Animal {
    String name;
    int age;
    DragonTypes dragonType;

    public Dragon(String name, int age, DragonTypes dragonType) {
        this.name = name;
        this.age = age;
        this.dragonType = dragonType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dragon dragon)) return false;
        return age == dragon.age && name.equals(dragon.name) && dragonType == dragon.dragonType;
    }

    @Override
    public int hashCode() {
        return 317 * age + name.hashCode() - dragonType.hashCode();
    }

    @Override
    public String toString() {
        return "This is dragon named " + name + " who is " + age + " years old and his type is  " + dragonType;
    }
}
