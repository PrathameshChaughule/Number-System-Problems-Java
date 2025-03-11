public class PerfectNumber{
    public static void main(String[] args){
        long num = 10;
        isPerfectNumber(num);
    }
    public static void isPerfectNumber(Long num){
        if(num==1){
            System.out.println("Not Perfect Number");
        }

        long sum = 1;
        for(long i=2; i*i<=num; i++){
            if(num % i == 0){
                sum = sum + i + num/i;
            }
        }
        if(sum == num){
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}