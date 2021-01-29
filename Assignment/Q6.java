import java.time.YearMonth;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month Number : ");
        int month = input.nextInt();
        System.out.println("Enter Year : ");
        int year = input.nextInt();
        YearMonth ym = YearMonth.of(year, month);
        String monthName = ym.getMonth().name().toLowerCase();
        System.out.printf("%s%s %s has %d days\n",monthName.substring(0,1).toUpperCase() ,monthName.substring(1), ym.getYear(),ym.lengthOfMonth());
        input.close();
    }
}
