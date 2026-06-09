package LearningThreads.Threads.BasicThreads.RC;
class TicketBooking {
    int seats = 3;
    public synchronized void bookSeat(String name) {
        if (seats > 0) {
            System.out.println(name + " booked successfully");
            seats--;
            System.out.println("Remaining Seats : " + seats);
        } else {
            System.out.println("for "+name + " seat not available");
        }
    }
}
public class bookmyshow {
    public static void main(String[] args) throws InterruptedException {
        TicketBooking booking = new TicketBooking();
        Thread t1 = new Thread(() -> booking.bookSeat("Chinnu😀"));
        Thread t2 = new Thread(() -> booking.bookSeat("Ravi😎"));
        Thread t3 = new Thread(() -> booking.bookSeat("Vishnu😁"));
        t1.start();
        t2.start();
        t3.start();


        t1.join();
        t2.join();
        t3.join();
    }
}
