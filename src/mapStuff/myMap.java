package mapStuff;

import animalStuff.Animal;

public interface myMap<K, V> {
    void clear();

    boolean containsKey(K key) throws Exception;

    V get(K key) throws Exception;

    boolean isEmpty();

    Animal remove(K key) throws Exception;

    Animal put(K key, V value) throws Exception;

    int size();

    V[] toArray();

}
