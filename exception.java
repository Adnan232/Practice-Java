import java.util.*;
public class exception {
    public static void main(String []args) {
        try {
            Scanner input = new Scanner(System.in);
            int arr[]=new int[5];
            
            int num=120,div;
            System.out.println("Enter Number :");
            div = input.nextInt();
            int q=num/div;
            arr[div] = 19;
            System.out.println("Error :"+q);
            input.close();
        }
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception occurs");  
        }    
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }
    }
}
