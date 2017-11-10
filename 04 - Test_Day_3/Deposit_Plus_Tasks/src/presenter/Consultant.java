package presenter;

import model.Bank;
import model.Printer;
import model.Service;
import model.exceptions.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consultant {

    private Service service;

    public Consultant() {
        service = new Service();
    }

    public void setDepositSum() {
        System.out.println("Вечер в хату! Давай замутим тебе депозит...");
        int userDepositSum = 0;
        while (userDepositSum <= 0) {
            System.out.println("Скока хочешь положить на депозит, братан? Тока не больше 500 у.е.");
            Scanner scan = new Scanner(System.in);
            try {
                service.setDepositSum(scan.nextInt());
            } catch (InputMismatchException exception) {
                System.out.println("Ты порожняк не толкай. Давай цифру.");
            } catch (SumLessZeroException e) {
                System.out.println("Чё, совсем бабла нет, братан?");
            } catch (SumExceedsLimitException e) {
                System.out.println("Не, мы такого фарта не предоставляем. Давай чё поменьше.");
            }
            userDepositSum = service.getDepositSum();
        }
        System.out.println("Значит " + userDepositSum + " у.е.? Пойдёт.");
    }

    public void setDepositTerm() {
        int userDepositTerm = 0;
        while (userDepositTerm <= 0) {
            System.out.println("На скока месяцев вкладывать будешь?");
            Scanner scan = new Scanner(System.in);
            try {
                service.setDepositTerm(scan.nextInt());
            } catch (InputMismatchException exception) {
                System.out.println("Ты порожняк не толкай. Давай цифру.");
            } catch (TermLessThanMinimumException e) {
                System.out.println("Не, давай шобы от 3.");
            } catch (TermExceedsLimitException e) {
                System.out.println("Не, давай не больше 12");
            }
            userDepositTerm = service.getDepositTerm();
        }
        System.out.println("На " + userDepositTerm + " месяца значит? Нормально, записал.");
    }

    public void lookForOptions(Bank[] banks) {
        System.out.println("Ну чё, давай посмотрим чё там есть...");
        String result;
        try {
            result = service.getDepositList(banks);
            System.out.println("Короче вот чё нашёл: \n" + result);
            System.out.println("\n\n");
            saveResultDialog(result);
        } catch (NoOffersFoundException e) {
            System.out.println("Опа. Походу нету ничё, братан.");
        }
    }

    private void saveResultDialog(String result) {
        int answer = 0;
        while (answer <= 0) {
            System.out.println("Чё, маляву писать будем?\n1 - Сохранить на диск?\n2 - Не");
            Scanner scan = new Scanner(System.in);
            try {
                answer = scan.nextInt();
            } catch (NumberFormatException exception) {
                System.out.println("Не, давай целое число: 1 или 2");
            } catch (InputMismatchException exception) {
                System.out.println("Чё та лажа, братан. Ты напиши 1 или 2");
            }
        }

        if (answer == 1) {
            Printer printer = new Printer();
            printer.PrintResult(result);
        } else {
            if (answer == 2) System.out.println("Ну нет так нет...");
        }

        System.out.println("\nОбращайся, братан!");
    }
}
