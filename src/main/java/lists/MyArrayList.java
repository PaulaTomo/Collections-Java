package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {


        ArrayList<String> arrList = new ArrayList<>(10);
        arrList.add("Maria");
        arrList.add("Ioana");
        arrList.add("Paula");
        arrList.add("Oana");
        arrList.add("Elena");
        arrList.add(0, "Emma");

        Iterator<String> iterator = arrList.iterator();

        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object + " ");
        }

        String element = arrList.get(2);
        System.out.println("The element of the index 2 is : " + element);
        Collections.sort(arrList);
        System.out.println("Sorted ArrayList : " + arrList);
        arrList.clone();
        System.out.println("ArrayList clone : " + arrList);

        Collections.reverse(arrList);
        System.out.println("reverse ArrayList : " + arrList);

        Collections.shuffle(arrList);
        System.out.println("Unmodifiable ArrayList : " + arrList);

        List<String> sublist = arrList.subList(2, 4);
        System.out.println("arrayList sublist : " + sublist);

        for (int i = 0; i < arrList.size(); i++) {

            System.out.println("The element of index " + i + " is: " + arrList);
        }
        boolean ans = arrList.contains("Paula");
        if (ans) {
            System.out.println("the list contains Paula");
        } else {
            System.out.println("The list does not contains paula");
        }

//        arrList.forEach((n) -> System.out.println(n));
        arrList.forEach(System.out::println);//lambda

        //new ArrayList
        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("abc");
        listTwo.add("def");
        listTwo.add("ghi");
        listTwo.add("abc");
        listTwo.add("jkl");
        listTwo.add("ghi");
        System.out.println(listTwo);
        listTwo.removeAll(Collections.singleton("abc"));
        System.out.println(listTwo);

        listTwo.set(listTwo.indexOf("def"), "xyz");
        System.out.println(listTwo);
        listTwo.set(3, "mno");
        System.out.println(listTwo);
        Collections.sort(listTwo);
        System.out.println(listTwo);

        for (String list : listTwo) {
            System.out.println(list);
        }
    }
}

