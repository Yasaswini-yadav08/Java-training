package LearningThreads.Threads.BasicThreads.RC;

class MyRace{
    int count = 0;
     public  void increment(){
        System.out.println("Increment of race");
        synchronized (this) {
            count++;
        }
        System.out.println("Race Done");
    }
}
public class RCO {
    public  static void main(String[] args) throws InterruptedException{
        MyRace r = new MyRace();
        Thread t1 = new Thread(()->
        {
            for (int i = 1; i <=1000 ; i++) {
                r.increment();;
            }
        });
        Thread t2 = new Thread(()->
        {
            for (int i = 1; i <=1000 ; i++) {
                r.increment();;
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count = "+ r.count);
    }
}
