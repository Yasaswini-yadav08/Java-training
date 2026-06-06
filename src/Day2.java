/*import java.util.*;
public class Day2 {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4};
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum += arr[i];
            arr[i] = sum;
        }
        System.out.print(Arrays.toString(arr));
    }
}
*/
import java.util.*;

public class Day2
{
    public static void main(String[] args) {

        int prices[] = {100,180,260,310,40,5,695};

        int profit = 0;

        for(int i = 1; i < prices.length; i++) {

            if(prices[i] > prices[i - 1]) {

                profit = profit + (prices[i] - prices[i - 1]);
            }
        }

        System.out.println(profit);
    }
}