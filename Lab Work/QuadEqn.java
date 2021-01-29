import java.util.Scanner;
public class QuadEqn 
{
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b and c for Quadratic Equation : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double d=(b*b)-(4*a*c);
        double x1=(-b+Math.sqrt(d))/(2*a);
        double x2=(-b-Math.sqrt(d))/(2*a);
        if(d == 0) {
            System.out.println("Real and Equal Roots : " + x1);
        } else if(d > 0) {
            System.out.println("Real and Distinct Roots: \n" + "x1: " + x1 + "\tx2: " + x2);
        } else {
            System.out.println("No real roots are possible!");
        }
        input.close();
    }
}