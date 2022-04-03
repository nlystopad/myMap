package mapStuff;

import animalStuff.Animal;
import animalStuff.Cat;
import animalStuff.Dragon;
import animalStuff.Fish;

import java.util.HashMap;
import java.util.Map;

public class myHashMap implements myMap<Integer, Animal> {

    public myHashMap() {
    }

    Map<Integer, Animal> map = new HashMap<>();

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean containsKey(Integer key) throws Exception {
        if (checkKey(key)) {
            return map.containsKey(key);
        } else {
            throw new Exception("number of aviary must be from 1 to 150");
        }
    }

    @Override
    public Animal get(Integer key) throws Exception {
        if (checkKey(key)) {
            return map.get(key);
        } else {
            throw new Exception("number of aviary must be from 1 to 150");
        }
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Animal remove(Integer key) throws Exception {
        if (checkKey(key)) {
            return map.remove(key);
        } else {
            throw new Exception("number of aviary must be from 1 to 150");
        }
    }

    @Override
    public Animal put(Integer key, Animal value) throws Exception {
        if (checkKey(key)) {
            if (checkAnimalType(key, value)) {
                return map.put(key, value);
            } else {
                throw new Exception("Looks like you are trying to put animal to wrong aviary, check the rules please");
            }
        } else {
            throw new Exception("number of aviary must be from 1 to 150");
        }
    }


    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Animal[] toArray() {
        return map.values().toArray(new Animal[0]);
    }

    // technical method
    private boolean checkKey(Integer key) {
        return key != null && key >= 1 && key <= 150;
    }

    private boolean checkAnimalType(Integer key, Animal value) {
        if (key <= 50 && !(value instanceof Dragon)) {
            return false;
        } else if (key > 50 && key <= 100 && !(value instanceof Cat)) {
            return false;
        } else if (key > 100 && key <= 150 && !(value instanceof Fish)) {
            return false;
        }
        return true;
    }
}
