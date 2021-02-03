public class multiplecatch {
    public static void main (String []args) {
        int arr[] = {2, 5, 7, 8, 10};        
        String s = "Adnan Habib A2305219429";
        int dtr = 0,tr = 2;
        try {
            // System.out.println(arr[3]);
            // System.out.println(s.charAt(10));
            // System.out.println(arr[2]/tr);
            System.out.println(arr[7]);
            System.out.println(s.charAt(30));
            System.out.println(arr[2]/dtr);
            
        }
        catch (ArithmeticException | StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception is Caught");
        }
    }
}
