/*import java.util.*;
public class Day1 {
    public static void main(String[] args){
        int arr[] ={1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}*/
/*public class Day1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}*/
public class Day1 {
    public static int findHouse(int r, int unit, int[] arr) {
        int total = r * unit;
        int sum = 0;
        if (arr == null || arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum >= total) {
                return i + 1;
            }
        }
        if (sum < total) {
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        int r = 7;
        int unit = 2;
        int[] arr = {2, 8, 3, 5, 6, 7, 8, 4};
        int result = findHouse(r, unit, arr);
        System.out.println(result);
    }
}