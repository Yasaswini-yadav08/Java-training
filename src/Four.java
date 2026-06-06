/*public class Four {
    public static void myClassDump() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 6, 5}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        myClassDump();
    }
}
*/
/*
public class Four {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 6, 5}
        };
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            //System.out.println(sum);
        }
        System.out.println(sum);
    }
}*/
public class Four {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int i = 0, j = 0;
        for (j  = 0; j < arr.length; j++) {
            for (i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

