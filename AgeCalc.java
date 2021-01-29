import java.time.LocalDate;
import java.time.Period;

public class AgeCalc
{  
   public static void main(String[] args)
    {
        LocalDate birthdate = LocalDate.of(2000, 07, 05);
        
        LocalDate current = LocalDate.now();
        
        Period difference = Period.between(birthdate, current);
        
        System.out.println("\nI am  "+difference.getYears()+" years, "+difference.getMonths()+" months and "+difference.getDays()+" days old.\n");
    }
}