class bankInfo {
    String name;
    String acType;
    double bal;

    bankInfo () {
        this.name = "NA";
        this.acType = "NA";
        this.bal = 0;
    }
    void getData (String n, String ac) 
    {
        this.name = n;
        this.acType = ac;
    }
    void deposit (double dt) {
        bal = bal+dt;
        System.out.println("\nAn amount of "+dt+" is deposited in your A/C.");
    }
    void withdraw (double wt) {
        if (bal > 500) {
            bal = bal-wt;
            System.out.println("\nAn amount of "+wt+" is withdrawn from your A/C.");
        }
        else {
            System.out.println("\nBalance below 500.");
        }
    }
    void display () {
        System.out.println("\nName : "+name);
        System.out.println("A/C Type : "+acType);
        System.out.println("A/C Balance : "+bal);
    }
}
public class bank {
    public static void main(String []args) {
        bankInfo s = new bankInfo();

        s.getData("Suresh", "Saving");
        s.display();
        s.deposit(25000);
        s.withdraw(15000);
        
        bankInfo i = new bankInfo();

        i.getData("Manav", "Current");
        i.display();
        i.withdraw(35000);
        i.deposit(75000);
        i.withdraw(35000);
    }
    
}
