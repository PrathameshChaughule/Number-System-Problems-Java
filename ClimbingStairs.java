public class ClimbingStairs {
    public static void main(String[] args){
        int num = 8;
        System.out.println(climbingStairs(num));
    }
    public static int climbingStairs(int num){
        if(num == 1){
            return 1;
        }
        int[] a = new int[num+1];
        a[1]=1;
        a[2]=2;

        for(int i=3; i<=num; i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[num];
    }
}
