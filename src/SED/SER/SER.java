package SED.SER;

import java.io.Serializable;
import java.sql.SQLOutput;

public class SER implements Serializable  {
    int id;
    String name;
    public SER(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void display()
    {
        System.out.println(id);
        System.out.println(name);
    }
    public static void main(String[] args) {
    }
}
