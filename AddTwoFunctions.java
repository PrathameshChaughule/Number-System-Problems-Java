public class AddTwoFunctions {
    public static void main(String[] args){
        int n1 = 2;
        int d1 = 4;
        int n2 = 6;
        int d2 = 5;
        int sum, d, min;

        if(d1==d2){
            sum = n1+n2; 
            d = d1;
        } else {
            d = d1*d2;
            n1 = n1*d2;
            n2 = n2*d1;
            sum = n1+n2;
            min = Math.min(sum, d);
            for(int i=2; i<=min; i++){
                if(sum%i==0 && d%i==0){
                    sum = sum/i;
                    d = d/i;
                }
            }
        }

        if(sum%d==0){
            sum = sum/d;
            System.out.println(sum);
        } else {
            System.out.println(sum +"/"+d);
        }

    }
}
