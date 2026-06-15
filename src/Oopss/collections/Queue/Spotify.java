package Oopss.collections.Queue;
import java.sql.SQLOutput;
import java.util.*;
import java.util.LinkedList;

public class Spotify {
    public static void main(String[] args) {
        java.util.Queue<String> q = new LinkedList<>();

        q.offer("monica");
        q.offer("boom boom");
        q.offer("i think they call this love");
        q.offer("baby");
        q.offer("perfect");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("0:poll()");
            System.out.println("1:peek()");
            System.out.println("2:clear()");
            System.out.println("3:add song");
            System.out.println("4:show queue");

            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println(q.poll());
                    System.out.println(q);
                    break;

                case 1:
                    System.out.println(q.peek());
                    break;
                case 2:
                    q.clear();
                    System.out.println(q);
                    break;
                case 3:
                    sc.nextLine(); // consume leftover newline
                    String song = sc.nextLine();
                    q.offer(song);
                    System.out.println("Added: " + song);
                    break;
                case 4:
                    System.out.println(q);
                    break;

            }
        }


    }
}
