package Comparator_Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CC {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(40);
        list.add(23);
        list.add(98);

/*
        Comparator<Integer> com=new Comparator<>()
        {
            public int compare(Integer a,Integer b)
            {
                if(a%10 > b%10)
                {
                    return 1;

                }
                return -1;
            }
        };*/

        Comparator<Integer> com = (a,b) -> a %10 > b%10 ? 1:-1;

        Collections.sort(list,com);
        System.out.println(list);
    }
}
//Take A class   get student id student name sort it based on student id
