import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {
    public static void main (String[] args) {
        reverseString ();
        sentenceIntoWords();
        spacesIntoAsterix();
        toUpperCase ();
        substring ();
    }

    public static void reverseString () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String, Bro, I'll REVERSE It");
        String initialString = scan.nextLine();
        String reverseString = new StringBuilder(initialString).reverse().toString();
        System.out.println(reverseString);
    }

    public static void sentenceIntoWords () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String, Bro, I'll SPLIT It into Words");
        String initialString = scan.nextLine();
        String[] splitStringToArray = initialString.split(" ");
        for (int i=0; i<splitStringToArray.length; i++) {
            System.out.println(splitStringToArray[i]);
        }
    }

    public static void spacesIntoAsterix () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a String, Bro, I'll REPLACE Spaces into *");
        String initialString = scan.nextLine();
        String result = initialString.replace(' ', '*');
        System.out.println(result);

    }

    public static void toUpperCase () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a String, Bro, I'll spell it Uppercase");
        String initialString = scan.nextLine();
        String result = initialString.toUpperCase();
        System.out.println(result);
    }

    public static void substring () {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a String, Bro, I'll show U Substring");
        String initialString = scan.nextLine();
        String result = initialString.substring(4,9);
        System.out.println(result);
    }
}