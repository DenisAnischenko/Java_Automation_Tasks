package model;

import java.util.Scanner;

public class Consultant {
    public static void userDepositSum () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Братан, какую сумму хочешь узять в кредит (500 USD MAX)");
        int userDepositSum = 0;
        try {
            userDepositSum = scan.nextInt();
        } catch (Exception e){
            System.out.println("Ты охуел? Это не число!");
        }
        if (userDepositSum > 500) {
            System.out.println("Ты охуел? Это слишком много!");
        }
        else if (userDepositSum <= 0) {
            System.out.println("Ничего не надо, даже шоколада?"); //Баг когда вводишь число
        }
    }
    public static void userDepositDuration () {
        Scanner scan = new Scanner(System.in);
        System.out.println("На сколько Дней? (30 Day MAX)");
        int userDepositDuration = scan.nextInt();
        Deposit.depositsIntoList();
      }
}
