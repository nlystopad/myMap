package animalStuff;

public class Fish extends Animal {
    String name;
    int age;
    boolean haveScales;

    public Fish(String name, int age, boolean haveScales) {
        this.name = name;
        this.age = age;
        this.haveScales = haveScales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish fish)) return false;
        return age == fish.age && haveScales == fish.haveScales && name.equals(fish.name);
    }

    @Override
    public int hashCode() {
        if (haveScales) {
            return 233 * age + name.hashCode() + 1;
        } else {
            return 233 * age + name.hashCode();
        }
    }

    public String toString() {
        String scales;
        if (haveScales){
            scales = "has scales";
        } else {
            scales = "don't has scales";
        }
        return "This is fish named " + name + " who is " + age + " years old and he " + scales;
    }
}
