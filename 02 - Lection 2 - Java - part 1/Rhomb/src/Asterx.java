//Ромб если честно списал. Прошу понять и простить. Обещаю разобраться

import java.util.*;

public class Asterx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Romb side, bitch!");
        int rombSide = scan.nextInt();
        int size = rombSide * 2 - 1;
        boolean[][] rhomb = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j == size / 2 - i || j == size / 2 + i) {
                    rhomb[i][j] = true;
                } else if (j == i - size / 2 || j == size + size / 2 - i - 1) {
                    rhomb[i][j] = true;
                }
            }
        }
        print(rhomb);
    }

    private static void print(boolean[][] arr) {
        for (boolean[] Arr : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (Arr[j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


