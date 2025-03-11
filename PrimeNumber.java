public class PrimeNumber {
    public static void main(String[] args){
        int num = 93187;
        int count = 0;
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                count = count + 1;
                if(num/i != i){
                    count = count + 1;
                }
            }
            if(count>2){
                break;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}
