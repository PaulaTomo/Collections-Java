package set;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {

        // New HashSet
        HashSet<Integer> set = new HashSet<>();

        // Add elements to original set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(20);

        // Make a new HashSet and copy all elements of
        // original HashSet using constructor
        HashSet<Integer> copyOfSet = new HashSet<>(set);

        // Print original HashSet
        System.out.println("Original HashSet: " + set);

        // Print Copy HashSet
        System.out.println("Copy HashSet: " + copyOfSet);

        set.add(60);
        System.out.println(set);

        set.remove(20);
        System.out.println(set);

        for (int itr : set) {
            System.out.println(itr);
        }

        if (set.contains(60)) {
            System.out.println("The HashSet contains the number 60");
        } else {
            System.out.println("The HashSet does not contains the number 60");

        }
        System.out.println("The length of the HashSet is : " + set.size());
    }
}

