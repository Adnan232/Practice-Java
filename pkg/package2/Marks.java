package pkg.package2;
import pkg.package1.student;
import java.util.*;
public class Marks extends student {
    public float phy,chem,maths;
    public void getMarks ()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks of Student "+name+" : ");
        phy = input.nextFloat();
        chem = input.nextFloat();
        maths = input.nextFloat();
        input.close();
    }
    public void setMarks() {
        float total = (phy+chem+maths);
        float avg = (phy+chem+maths)/3;
        System.out.println("Name : "+name);
        System.out.println("Total Marks : "+total);
        System.out.println("Average Marks : "+avg);
    }
}
