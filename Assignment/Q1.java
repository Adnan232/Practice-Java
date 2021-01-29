public class Q1 {
    public static void main(String[] args) {

    System.out.println("str1 = Adnan");
    System.out.println("str2 = Load");
    System.out.println("str3 = ground");
    System.out.println("str4 = load");
    System.out.println("str5 = str2.toLowerCase()");
    System.out.println("str6 = qwerty");
    System.out.println("str7 = Disguised Coder\n");

    // charAt()
    String str1 = "Adnan";
    System.out.println("charAt()");
    for(int i = 0; i < str1.length(); i++)
    System.out.print(str1.charAt(i) + "+");
    System.out.println();

    // compareTo()
    System.out.println("\ncompareTo()");
    String str2 = "Load";
    String str3 = "ground";
    String str4 = "load";
    System.out.println(str2.compareTo(str3));
    System.out.println(str2.compareTo(str1));
    System.out.println(str2.compareTo(str4));
    
    // compareToIgnoreCase()
    System.out.println("\ncompareToIgnoreCase()");
    System.out.println(str2.compareToIgnoreCase(str4));
    
    // concat()
    System.out.println("\nconcat()");
    System.out.println(str2.concat(" ").concat(str1));
    
    // endsWith()
    System.out.println("\nendsWith()");
    System.out.println(str3.endsWith("nd"));
    System.out.println(str3.endsWith("ND"));
    
    // equals()
    System.out.println("\nequals()");
    String str5 = str2.toLowerCase();
    System.out.println(str4.equals(str5));
    
    // indexOf()
    System.out.println("\nindexOf()");
    System.out.println(str3.indexOf('r'));
    
    // lastIndexOf()
    System.out.println("\nlastIndexOf()");
    System.out.println(str3.lastIndexOf('r'));
    
    // length()
    System.out.println("\nlength()");
    System.out.println(str2.concat(" ").concat(str1).length());
    
    // toUpperCase()
    System.out.println("\ntoUpperCase()");
    String str6 = "qwerty";
    System.out.println(str6.toUpperCase());
    
    // toLowerCase()
    System.out.println("\ntoLowerCase()");
    System.out.println(str6.toUpperCase().toLowerCase());
    
    // trim()
    System.out.println("\ntrim()");
    String str7 = " Disguised Coders ";
    System.out.println(str7.trim());
    }
}