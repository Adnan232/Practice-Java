package pkg.package1;
import java.util.*;
public class student {
    public String name;
    public void getName()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = input.nextLine();
        input.close();
    } 
}
