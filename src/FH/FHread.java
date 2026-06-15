package FH;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FHread {
    static void main(String[] args) throws IOException {
        System.out.println("Creating my file");
        String path ="C:\\Users\\avula\\IdeaProjects\\java fullstack\\src\\FH\\test.txt";
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        int ch;
        int c =0;
        while (((ch = br.read())!= -1)){
            System.out.println((char)ch);
            c++;
        }
        System.out.println(c);
        /*char r = (char)br.read();
        System.out.println(r);*/
    }
}
