import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two floating numbers : ");
        String a = input.next();
        String b = input.next();
        a = a.substring(0, a.indexOf('.') + 4);
        b = b.substring(0, b.indexOf('.') + 4);
        if(a.compareTo(b) == 0) {
            System.out.println("They are same upto three decimal places.");
        } else {
            System.out.println("They are different.");
        }
        input.close();
    }
}