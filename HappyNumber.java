import java.util.*;

public class HappyNumber {
    public static void main(String[] args){
        int num = 65536;
        System.out.println(isHappyNumber(num));
    }
    public static boolean isHappyNumber(int num){
        Set<Integer> usedInteger = new HashSet<>();
        while(true){

            int sum = 0;
            while(num > 0){
                int r = num%10;
                sum = sum + r*r;
                num = num/10;
            }
            if(sum == 1){
                return true;
            }
            num = sum;

            if(usedInteger.contains(num)){
                return false;
            }
            usedInteger.add(num);
        }
    }
}
