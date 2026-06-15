package FH;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) throws IOException {
        System.out.println("Createing my file");
        String path = "C:\\Users\\avula\\IdeaProjects\\java fullstack\\src\\FH\\test.txt";
        File f = new File(path);
        FileWriter fw = new FileWriter(f,true);
        BufferedWriter bw = new BufferedWriter(fw);
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        bw.newLine();
        bw.write(inp);/*
        fw.write("Hello Iam yashu");
        bw.write("Hello World!");*/
        bw.close();
        fw.close();
    }
}