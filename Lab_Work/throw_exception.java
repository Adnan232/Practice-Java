import java.util.Scanner;
public class throw_exception {

    public static void g (float cgpa) {
        if (cgpa > 4.6) {
            throw new ArrayStoreException();
        }
        else if (cgpa > 4.0 && cgpa <= 4.6) {
            throw new Exception();
        }
        else
            System.out.println("But, Student is not eligible for Scholarship");
    }
    void f (float cgpa) {
        try {
            if (cgpa < 3.5) {
                throw new ArithmeticException();
            }
            else {
                System.out.println("Student is promoted to next Acedemic Year.");
                g(cgpa);
            }
        }
        catch (ArithmeticException f) {
            System.out.println("Student cannot be promoted to next Acedemic Year");
        }
        catch (ArrayStoreException e) {
            System.out.println("Student is eligible for 100% Scholarship");
        }
        catch (Exception f) {
            System.out.println("Student is eligible for 50% Scholarship");
        }
    }
    public static void main (String []args) {
        throw_exception o = new throw_exception();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter cgpa : ");
        float grade = input.nextFloat();
        o.f(grade);
        input.close();
    }
}
