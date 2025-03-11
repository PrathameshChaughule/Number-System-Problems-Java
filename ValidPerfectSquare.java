public class ValidPerfectSquare {
    public static void main(String[] args){
        int num = 25;
        System.out.print(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num){

        if(num < 2){
             return true;
        }

        long start = 2;
        long end = num/2;

        while(start <= end){
            long mid = start + (end-start)/2;

            if(mid*mid == num){
                return true;
            } else if(mid*mid > num){
                end = mid - 1;
            } else {
                start = mid +1;
            }
        }

        return false;













        // if(num < 2){
        //     System.out.println(num +" Perfect Square");
        // }

        // for(int i = 2; i <= num/2; i++){
        //     if((i*i) == num){
        //         System.out.println(num +" Perfect Square");
        //     }
        // }

        // System.out.println(num +" Not perfect Square");

    }
}
