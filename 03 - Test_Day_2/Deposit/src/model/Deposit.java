package model;

import java.util.ArrayList;

public class Deposit {
    public int sum = 0;
    int duration = 0;
    int percentRate = 0;

    public static void depositsIntoList() {
        ArrayList depositsList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            Deposit deposit = new Deposit();
            deposit.sum = i + (i*50) -i;
            deposit.duration = i + (i*3) -i;
            deposit.percentRate = i+ (i*10) -i;
            depositsList.add(deposit);
        }
        for (int j=0; j<depositsList.size(); j++) {
            System.out.println(depositsList.get(j));
        }
//        System.out.println(depositsList.size());
//        mInfoTextView.setText("Все коты: " + catName);
//        depositsList.forEach(s -> System.out.println(depositsList. + ", " + s.fieldname1));
    }


    @Override
    public String toString() {
        return "Deposit{" +
                "sum=" + sum +
                ", duration=" + duration +
                ", percentRate=" + percentRate +
                '}';
    }
}
