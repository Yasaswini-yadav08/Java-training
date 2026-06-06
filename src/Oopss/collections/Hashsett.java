package Oopss.collections;

import java.util.LinkedHashSet;

public class Hashsett {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<>();
        ls.add("Chinnu");
        ls.add("Chinni");
        ls.add("yashu");
        ls.add("Ammadi");
        ls.add("Ammadi");
        ls.add("Chinnu");
        System.out.println(ls);
        ls.remove("Ammadi");
        System.out.println(ls);
        System.out.println(ls.contains("yashu"));
        //System.out.println(ls);
    }
}
