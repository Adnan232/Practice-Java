class Empl {
    String name;
    String design;
    int workHr;
    Empl() {
        this.name = "NA";
        this.design = "NA";
        this.workHr = 6;
    }
    void getData(String n, String d, int h ) {
        this.name = n;
        this.design = d;
        this.workHr = h;
        
    }
    void display () {
        System.out.println("Name : "+name);
        System.out.println("Designation : "+design);
        System.out.println("Working hours : "+workHr);
    }
}
class programmer extends Empl {
    
    double bonus;
    double sal;
    
    programmer() {
        this.bonus = 25000;
        this.sal = bonus + 75000;
    }
    void displayProgrammer () {
        System.out.println("\nName : "+name);
        System.out.println("Designation : "+design);
        System.out.println("Working hours : "+workHr);
        System.out.println("Salary : "+sal);
        System.out.println("Bonus : "+bonus);
    }
    
}
class analyst extends Empl {
    
    double bonus;
    double sal;
    
    analyst() {
        this.bonus = 50000;
        this.sal = bonus + 75000;
    }
    void displayAnalyst () {
        System.out.println("\nName : "+name);
        System.out.println("Designation : "+design);
        System.out.println("Working hours : "+workHr);
        System.out.println("Salary : "+sal);
        System.out.println("Bonus : "+bonus);
    }
    
}
class projectLeader extends Empl {
    
    double bonus;
    double sal;
    
    projectLeader() {
        this.bonus = 15000;
        this.sal = bonus + 75000;
    }
    void displayprojectLeader () {
        System.out.println("\nName : "+name);
        System.out.println("Designation : "+design);
        System.out.println("Working hours : "+workHr);
        System.out.println("Salary : "+sal);
        System.out.println("Bonus : "+bonus);
    }
    
}

public class emp {
    public static void main(String []args) {
        programmer p = new programmer();
        p.getData("Adnan", "Programmer", 8);
        p.displayProgrammer();
        
        analyst a = new analyst();
        a.getData("Habib", "Analyst", 10);
        a.displayAnalyst();
    }

}
