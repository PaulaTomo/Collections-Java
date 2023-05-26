package lists;

import java.util.*;

public class MyLinkedList {
    public static void main(String[] args) {

//Create LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        //add elements
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(4);
        Iterator itr = myLinkedList.iterator();

        //iteration from list
        while (itr.hasNext()) {
            Object number = itr.next();
            System.out.println(number);
        }
//first number and last number
        myLinkedList.addFirst(0);
        myLinkedList.addLast(7);
        System.out.println(myLinkedList);

        //iteration from index 2
        ListIterator<Integer> listIterator = myLinkedList.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        int firstNumber = myLinkedList.getFirst();
        int lastNumber = myLinkedList.getLast();
        System.out.println("the first number in the my LinkedList is " + firstNumber + " the last number is " + lastNumber);
        //reverse
        Collections.reverse(myLinkedList);
        System.out.println("Reverse LinkedList : " + myLinkedList);
        //sort
        Collections.sort(myLinkedList);
        System.out.println("Sort LinkedList : " + myLinkedList);


        //iterator
        ListIterator<Integer> indexIterator = myLinkedList.listIterator();
        while (indexIterator.hasNext()) {
            int index = indexIterator.nextIndex();
            int num = indexIterator.next();
            System.out.println("the number of te index " + index + " is " + num);
        }
        myLinkedList.forEach((n) -> System.out.println(n));

        //new LinkedList
        LinkedList<String> person = new LinkedList<>();
        person.add("John");
        person.add("Will");
        person.add("Ray");
        person.add("Beatrice");

        for (int i = 0; i < person.size(); i++) {
            String personList = person.get(i);
            System.out.println(i + " " + personList);

        }
        Collections.reverse(person);
        System.out.println(person);
        Collections.shuffle(person);
        System.out.println(person);
        person.removeFirst();
        System.out.println(person);

        person.set(2, "Alex");
        System.out.println(person);
        for (String list : person) {
            System.out.println(list);


        }
        LinkedList copyList = new LinkedList<>();
        copyList = (LinkedList) person.clone();
        System.out.println("copyList: " + copyList);


        person.add(3, "Paula");
        System.out.println(person);

        System.out.println(person.getFirst());
        System.out.println(person.getLast());
        System.out.println(person.get(2));

        int listLength = person.size();
        System.out.println("The length list is = " + listLength);
        person.set(1, "Emma");
        System.out.println(person);
        person.clear();
        System.out.println("the list has been deleted" + person);


    }


}
