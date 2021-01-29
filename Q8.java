import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Value : ");
        int n = input.nextInt();
        int k = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = n; j > i; j--) {
            System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
            System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
        input.close();
    }
}