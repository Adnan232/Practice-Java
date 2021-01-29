import java.util.*;
interface speed {
    public void getSpeed();
}
interface price {
    public void getPrice();
}
class vehicle {
    String name;
    void getData(String n) {
        this.name = n;
    }
}
public class classInterface extends vehicle implements speed, price {
    public void getSpeed () {
        // float speed = 120;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Speed : ");
        float speed = input.nextFloat();
        input.close();

        System.out.println("Vehicle : "+name);
        System.out.println("Speed : "+speed);
    }
    public void getPrice () {
        // double price = 15000;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Price : ");
        double price = input.nextDouble();
        input.close();

        System.out.println("Vehicle : "+name);
        System.out.println("Price : "+price);
    }
    public static void main (String []args) {
        classInterface a = new classInterface();
        a.getData("toyota");
        a.getSpeed();
        a.getPrice();
    }
}

