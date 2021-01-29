public class fact {
    public static void main (String []args) {
        int fac = 1;
        int num = Integer.parseInt(args[0]);
        for (int i=1;i<=num;i++) {
            fac = fac*i;
        }
        System.out.println("Factorial of Number entered by user = "+fac);
    }
}
