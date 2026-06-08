package LearningThreads.Threads.BasicThreads;

public class MyThreads extends Thread{
@Override
    public void run(){
    for (int i = 1; i <=3 ; i++) {
        try{
            Thread.sleep(2000);
            System.out.println(i + "Iam new Thread");
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
}
