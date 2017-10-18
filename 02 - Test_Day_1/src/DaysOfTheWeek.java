import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main (String[] args) {
        String[] daysOfTheweekArray = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Введи число от 1 до 7, ёпта");
        int dayOfTheweekNumber = scan.nextInt();
        if (dayOfTheweekNumber > 0 && dayOfTheweekNumber <=7) {
            System.out.println("Your day is " + daysOfTheweekArray[dayOfTheweekNumber -1]);
        }
        else {
            System.out.println("Пиздос, ты можешь ввести чисто от 1 до 7");
        }
    }
}
