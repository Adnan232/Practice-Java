import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int a = input.nextInt();
        System.out.println("Enter Num2 : ");
        int b = input.nextInt();
        System.out.println("Enter Num3 : ");
        int c = input.nextInt();
        if (a < b && b < c)
        {
            System.out.println("Increasing order");
        }
        else if (a > b && b > c)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
        input.close();
    }
}