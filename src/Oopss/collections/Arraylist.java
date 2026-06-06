package Oopss.collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
        List<String> list1 = new ArrayList<>();

        list1.add("Beat it");
        list1.add("Kolavari di");
        list1.add("Emaypothaneyyyy");
        list1.add("Nuvveyyy nannu kadannakaa");
        list1.add("Nuvveyy nuveyy");
        for(String song : list1) {
            System.out.println(song);
        }
        System.out.println(list1.remove(0));
        System.out.println(list1);
        System.out.println(list1.set(1,"Prapanchamantha coreyy ramudey nuvvaa"));
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        System.out.println(list1.contains("Hello rammantey"));
    }
}