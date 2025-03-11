public class QuadraticEquation {
    public static void main(String[] args){
        double r1,r2;
        double x,y;
        double a=2;
        double b=5;
        double c=3;

        double d = (b*b)-(4*a*c);

        if (d==0) {
            System.out.println("Real and Equal");
            r1=r2= -b/(2*a);
            System.out.println("R1=" + r1);
            System.out.println("R2=" + r2);
        } else if (d>0) {
            System.out.println("Real and Distinct");
            r1 = ((-b+Math.sqrt(d))/(2*a));
            r2 = ((-b-Math.sqrt(d))/(2*a));
            System.out.println("R1=" + r1);
            System.out.println("R2=" + r2);
        } else {
            System.out.println("Distinct and Imaginary");
            x = -b/(2*a);
            y = (Math.sqrt(-d))/(2*a);
            System.out.println("R1=" + x + "+i" + y);
            System.out.println("R2=" + x + "-i" + y);
        }
    }
}
