public class LCM 
{
    public static int gcd(int a, int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }    
    static int lcm(int a, int b)
    {
        int l=a*b/gcd(a,b);
        return l;
    }
    static void lcm(int a, int b, int c)
    {
        int lcm = lcm(lcm(a,b),c);
        System.out.println("The Numbers are : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("LCM : "+lcm);
    }
    public static void main(String[] args) 
    {
        lcm(7,3,6);    
    }
}
