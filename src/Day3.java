/*public class Day3 {
    public static void main(String[] args) {
        String str = "i love to code in java programming";
        String[] words = str.split(" ");
        String max = words[0];
        int i = 0;
        int j = 0;
        for (i = 1; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
            }
        }
        System.out.println(max);
    }
}*/
/*public class Day3 {
    public static void main(String[] args) {
        String pass = "Chinni@1234";
        int digit=0;
        int capital=0;
        if(pass.length() == 0){
            System.out.print("Invalid");
            return;
        }
        if (pass.length() < 4)
        {
            System.out.print("Invalid");
            return;
        }
        if(Character.isDigit(pass.charAt(0)))
        {
            System.out.print("Invalid");
            return;
        }
        for(int i=0;i<pass.length();i++){
            char ch = pass.charAt(i);
            if(ch == ' ' && ch == '/')
            {
                System.out.print("Invalid");
                return;
            }
            if(Character.isDigit(ch))
            {
                digit++;
            }
            if(Character.isUpperCase(ch))
            {
                capital++;
            }
        }
        if(digit >= 1 && capital >= 1) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}*/
/*public class Day3 {
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";
        int result = str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2)
        {
            int v = str.charAt(i+1)-'0';
            char ch =str.charAt(i);
            if(ch == 'C')
            {
                result = result ^ v;
            } else if (ch == 'A') {
                result = result & v;
            } else if (ch == 'B') {
                result = result | v;
            }
        }
        System.out.println(result);
    }
}*/
/*public class Day3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = {2,3,6,9,12};
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                for(int k=0;k<arr3.length;k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        System.out.println(arr1[i]);
                    }
                }
            }
        }
    }
}*/
//USING THREE POINTERS
/*public class Day3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = {2,3,6,9,12};
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length && k<arr3.length)
        {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k])
            {
                System.out.println(arr1[i]);
                i++;
                j++;
                k++;
            }
            else if(arr1[i] < arr2[j])
            {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }
    }
}*/
/*
public class Day3 {
    public static void main(String[] args) {
        int n = 4;
        int i=0;
        for(i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}*/
/*
public class Day3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if (i == 1 || i == n|| j == 1 || j == n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println( );
        }
    }
}*/
/*public class Day3 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++ )
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}*/
import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        int[] arr ={2,-5,1,7,-3,4,-6};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum =0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}