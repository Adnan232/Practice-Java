class employee{
    String name, designation;
    double salary=75000;
    void getData(String n, String design)
    {
        this.name = n;
        this.designation = design;
    }
    void sal()
    {
        switch(designation){
            case "Manager" : 
                            salary = salary+5000;
                            break;
            case "General Manager" : 
                            salary = salary+10000;
                            break;
            case "CEO" : 
                            salary = salary+20000;
                            break;
            case "Worker" : 
                            salary = salary+2000;
                            break;
            default : 
                        System.out.println("No Increment in Salary");
                        break;
        }
    }
    void display()
    {
        System.out.println("\nName : "+name);
        System.out.println("Designation : "+designation);
        sal();
        System.out.println("Salary : "+salary);
    }

}
public class classEmp {
    public static void main (String []args) {
        employee e1 = new employee();
        employee e2 = new employee();
        e1.getData("Adnan", "CEO");
        e1.display();
        e2.getData("Habib", "General Manager");
        e2.display();

    }
}
