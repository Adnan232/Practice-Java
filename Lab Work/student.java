class stud {
    String name;
    String rollno;
    void getData (String n, String r) {
        this.name = n;
        this.rollno = r;
    }
    void display () {
        System.out.println("Name : "+name);
        System.out.println("RollNo : "+rollno);
    }
}
class exam {
    float marks[];
    void getMarks(float m1,float m2,float m3,float m4,float m5)
    {
        this.marks[0]=m1;
        this.marks[1]=m2;
        this.marks[2]=m3;
        this.marks[3]=m4;
        this.marks[4]=m5;
    }
}


// public class stude {
    
// }
