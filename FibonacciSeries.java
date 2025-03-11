public class FibonacciSeries {
    public static void main(String[] args){
        int term = 7;
        System.out.print("0 ");
        int[] a = new int[term+1];
        a[1]=1;
        a[2]=1;
        for(int i=3; i<=term; i++){
            a[i]=a[i-1]+a[i-2];
            System.out.print(a[i]+" ");
        }
    }
}
