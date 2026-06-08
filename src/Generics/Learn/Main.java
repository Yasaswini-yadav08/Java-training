package Generics.Learn;

public class Main {
    public static void main(String[] args) {
        content<String> c1 = new content<>();
        c1.setName("Chinni");
        System.out.println(c1.getName());
        Items<String, Double,Boolean> i = new Items("banana",10.3,true);
        System.out.print(i.getName() + " " + i.getB() + " " + i.getD());
    }
}
