public class SumOfNaturalNumber {
    public static void main(String[] args){
        int n = 5;
        System.out.println(getNaturalNumber(n));
    }
    public static int getNaturalNumber(int n){
        // int sum = n*(n+1)/2;
        // return sum;
        
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
