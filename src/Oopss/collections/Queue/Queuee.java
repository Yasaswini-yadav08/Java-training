package Oopss.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        Queue<Integer> q =new LinkedList<>();
        q.add(1);
        q.offer(2);
        q.add(3);
        q.add(4);
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        System.out.println(q.poll());
        q.offer(5);
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);
        System.out.println(q.peek());//when queue is empty it will not throw error it will give null/boolean
        //q.clear();
        System.out.println(q.element());//it will throw error when queue is empty
    }
}
