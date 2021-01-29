// import java.util.Scanner;

public class array {
    public static void main(String []args) {
        // Scanner input = new Scanner(System.in);
        int arr[] = {1,4,2,5,3};
        int sum=0;
        for (int i:arr) {
            sum=sum+arr[i];
        }
        double avg = sum/(arr.length);
        System.out.println("Sum of array Elements = "+sum);
        System.out.println("Average of array Elements = "+avg);

    }
    
}
