import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Enter year that you want:");
        year=scanner.nextInt();
        boolean isLeapYear= false;
        boolean isDivisible4=year%4==0;
        if(isDivisible4){
            boolean isDivisible100=year%100==0;
            if(isDivisible100){
                boolean isDivisible400=year%400==0;
                if(isDivisible400){
                    isLeapYear=true;
                }
            }
        }else {
            isLeapYear=true;
        }
        if(isLeapYear){
            System.out.println(year+"is a Leap Year!");
        }else {
            System.out.println(year+"is not a Leap Year!");
        }
    }
}
