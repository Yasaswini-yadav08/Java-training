package oops.Encapsulation;

abstract class Vehicle
{
    void testRide()
    {
        System.out.println("This is test ride");
    }

    abstract void buy();
    abstract void price();
}

class Car extends Vehicle
{
    @Override
    void buy()
    {
        System.out.println("Car purchased");
    }

    @Override
    void price()
    {
        System.out.println("Car price is 10 lakhs");
    }
}

public class Abs
{
    public static void main(String[] args)
    {
        Vehicle v = new Car();

        v.testRide();
        v.buy();
        v.price();
    }
}