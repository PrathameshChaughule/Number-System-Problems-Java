public class PermutationCircular {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(permutationCircular(num));
    }
        public static int permutationCircular(int num){
            num = num -1;
            int result = 1;
            while (num > 0) {
                result = result * num;
                num --;
            }
            return result;
        }
}
