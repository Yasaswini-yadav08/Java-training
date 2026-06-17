package TCSNQT;

import java.util.Scanner;

public class EvenOddDatefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int d = sc.nextInt();
        int fine = sc.nextInt();
        int sum = 0;
        int i=0;
        for(i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        if(d %2 != 0)
        {
            for(i=0;i<n;i++)
            {
                if(arr[i] %2 == 0){
                    sum += fine;
                }
            }
        }
        else{
            for (i = 0; i < n; i++) {
                if(arr[i] %2 != 0){
                    sum +=fine;
                }
            }
        }
        System.out.println(sum);
    }
}
