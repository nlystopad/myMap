import animalStuff.Cat;
import animalStuff.Dragon;
import animalStuff.DragonTypes;
import animalStuff.Fish;
import mapStuff.myHashMap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        Let's imagine we have nursery or farm.
        There we have 3 types of animals : dragons (remember, we are imaging), cats and fishes
        Each animal has its own aviary. To store information about our animals we can use hashMap, where keys are
        numbers of aviary and values are animals
        our nursery has only 150 enclosures
        Also for each type of animal there are only 50 enclosures:
        1-50 for dragons, 51-100 for cats and rest are for fishes
         */
        myHashMap map = new myHashMap();
        map.put(14, new Dragon("Smaug", 400, DragonTypes.FIRE));
        System.out.println(Arrays.toString(map.toArray()));
//        map.put(-3, new Cat("Leopold", 8, "red"));
        map.put(61, new Cat("Leopold", 9, "red"));
        System.out.println(Arrays.toString(map.toArray()));
        map.put(102, new Fish("Fishy", 1, true));
        map.put(103, new Fish("Fishyy", 1, false));
        map.put(103, new Fish("Fishyyyy", 1, false));
        System.out.println(Arrays.toString(map.toArray()));
        System.out.println(map.size());
        System.out.println(map.containsKey(50));
        System.out.println(map.containsKey(103));
        System.out.println(map.get(102));
        map.remove(14);
        System.out.println(Arrays.toString(map.toArray()));
        map.clear();
        System.out.println(Arrays.toString(map.toArray()));
    }
}
