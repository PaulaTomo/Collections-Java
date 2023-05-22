package dataStructures.teachbit;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
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

        Collections.reverse(myLinkedList);
        System.out.println("Reverse LinkedList : " + myLinkedList);

        Collections.sort(myLinkedList);
        System.out.println("Sort LinkedList : " + myLinkedList);


        ListIterator<Integer> indexIterator = myLinkedList.listIterator();

        while (indexIterator.hasNext()) {
            int index = indexIterator.nextIndex();
            int num = indexIterator.next();
            System.out.println("the number of te index " + index + " is " + num );
        }
    }
}
