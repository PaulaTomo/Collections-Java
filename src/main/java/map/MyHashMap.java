package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");

        System.out.println(hashMap);

        System.out.println("HashMap size is: " + hashMap.size());

        HashMap<Integer, String> copyHashMap = new HashMap<Integer, String>(hashMap);

        System.out.println("copyHashMap = " + copyHashMap);

        hashMap.clear();
        System.out.println(hashMap);

        if (hashMap.isEmpty()) {
            System.out.println("The HashMap is empty");
        } else {
            System.out.println("HashMap contains the elements: " + hashMap);
        }

        if (hashMap.containsKey(2)) {
            System.out.println("The HashMap contain the key 2");
        } else {
            System.out.println("The HashMap does not contain the key 2");
        }

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Black");
        hashMap.put(4, "orange");

        String element = hashMap.get(4);
        System.out.println(element);

        Set<Integer> keySet = hashMap.keySet();

        for (Integer keys : keySet) {
            System.out.println("Key: " + keys);
        }

        Collection<String> valuesOfHashMap = hashMap.values();
        for (String value : valuesOfHashMap) {
            System.out.println("Value : " + value);
        }
    }

}
