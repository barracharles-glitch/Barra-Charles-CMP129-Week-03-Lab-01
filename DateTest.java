import java.util.Scanner;

public class DateTest {
    public static void main(String[]args){
        int month, day, year;
        Scanner int_scan = new Scanner(System.in);

        do{
            System.out.print("Enter the month(1-12): ");
            month = int_scan.nextInt();
            if (month > 12 || month < 1)
                System.out.println("Not a month. Enter a month 1-12. ");
        }while(month > 12 || month < 1);

        do{
            System.out.print("Enter the day(1-31): ");
            day = int_scan.nextInt();
            if (day > 31 || day < 1)
                System.out.println("Not a day. Enter a day 1-31. ");
        }while(day > 31 || day < 1);

        System.out.print("Enter the year: ");
        year = int_scan.nextInt();


        Date date1 = new Date(month, day, year);

        System.out.println(date1.formatDate(month, day, year) + "\n" + 
        date1.formatDate2(month, year, day) + "\n" + 
        date1.formatDate3(month, year, day));

        int_scan.close();
    }
}
