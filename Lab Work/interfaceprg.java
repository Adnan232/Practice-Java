// import java.util.*;
interface motorBike {
    void bikeDisp(float speed, float dis);
}
interface Cycle {
    void cycleDisp(float speed, float dis);
}
class twoWheelers implements motorBike, Cycle {
    public void bikeDisp(float a, float b) {
        System.out.println("Speed :"+a+"km/h");
        System.out.println("Distance :"+b+"km");
        System.out.println("Time Taken :"+(b/a)+"h");
    }
    public void cycleDisp(float a, float b) {
        System.out.println("Speed :"+a+"km/h");
        System.out.println("Distance :"+b+"km");
        System.out.println("Time Taken :"+(b/a)+"h");
    }
}

public class interfaceprg {
    public static void main (String args[]) {
        twoWheelers t = new twoWheelers();
        System.out.println("For MotorBike");
        t.bikeDisp(55, 1500);
        System.out.println("\nFor Cycle");
        t.cycleDisp(15, 500);
    }    
}
