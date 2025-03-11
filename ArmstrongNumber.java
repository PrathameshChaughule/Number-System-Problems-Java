import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        
        if(isArmstrongNumber(num) == num){
            System.out.println(num+ " is an armstrong number");
        } else{
            System.out.println(num+ " is not an armstrong number");
        }
    }
    public static int isArmstrongNumber(int num){
        int r;
        int sum = 0;
        while (num > 0) {
            r = num % 10;
            num = num / 10;
            sum = sum + r*r*r;
        }
        return sum;
    }
}
