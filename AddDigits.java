import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num){
        if(num==0){
            return 0;
        }
        if(num % 9==0){
            return 9;
        } else {
            return num%9;
        }
    }
}
