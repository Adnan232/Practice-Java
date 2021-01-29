class immutable {
    private final String name;
    private final String eno;
    private final float classTime;
    public immutable (String n, String e, float ct) {
        this.name = n;
        this.eno = e;
        this.classTime = ct;
    }

    private final void display() {
        System.out.println("Name : "+name);
        System.out.println("ENo : "+eno);
        System.out.println("Timings : "+classTime);
    }
    public static void main(String []args) {
        immutable i = new immutable("Adnan","A2305219429",1500);
        i.display(); 
    }
}