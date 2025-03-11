public class Number{
    public static void main(String[] args){
        int num = 1009;

        if(num==0){
            System.out.print("Zero &");
        } if(num>0){
            System.out.print("Positive &");
        } else {
            System.out.print("Negative &");
        }

        if(num%2==0){
            System.out.print(" Even");
        } else {
            System.out.print(" Odd");
        }
    }
}
