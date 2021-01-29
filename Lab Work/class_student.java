class student
{
    String name;
    int rollno;
    float marks1,marks2,marks3;
    void getData(String n, int r, float m1, float m2, float m3)
    {
        this.name = n;
        this.rollno = r;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+rollno);
        System.out.println("Marks1 : "+marks1);
        System.out.println("Marks2 : "+marks2);
        System.out.println("Marks3 : "+marks3);

    }
}



public class class_student {
    public static void main(String []args){
        student s1 = new student();
        s1.getData("Adnan Habib", 429, 87, 77, 88);
        s1.display();
    }
    
}
