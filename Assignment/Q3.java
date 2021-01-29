import java.io.*;
class Q3
{
    public static void main( String Args[])throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hi! What is your name?");
        String Name = input.readLine();
        System.out.println("Hello " + Name + "!");
    }
}