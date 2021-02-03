public class TEST {  
    public void myMethod()   
  {  
  System.out.println("Method");  
  }  
    
  {  
  System.out.println(" Instance Block");  
  }  
        
   TEST()  
  {  
  System.out.println("Constructor ");  
  }  
  static {  
      System.out.println("static block");  
  }  
  public static void main(String[] args) {  
  TEST c = new TEST();  
  c.myMethod();  
}  
}