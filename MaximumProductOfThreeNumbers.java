import java.util.*;

public class MaximumProductOfThreeNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int[] num = {-10, -10, 5, 3, 1};
        int length = sc.nextInt();
        int[] num = new int[length];
        for(int i=0; i < length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println(maximumProduct(num));
    }
    public static int maximumProduct(int[] num){
        Arrays.sort(num);
        int n = num.length;
        return Math.max(num[0]*num[1]*num[n-1], num[n-1]*num[n-2]*num[n-3]);
    }
}