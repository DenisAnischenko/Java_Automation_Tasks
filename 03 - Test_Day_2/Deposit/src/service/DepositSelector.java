package service;

import model.Deposit;

import java.util.ArrayList;

public class DepositSelector {

    private int userDepositSum;
    private ArrayList depositsList;

    public void setUserDepositSum (int userDepositSum) {
        this.userDepositSum = userDepositSum;
    }
    public void depositsList (ArrayList depositsList) {
        this.depositsList = depositsList;
    }

    public int depositSelector () {
        int index = -1;
        Deposit deposit;
        Deposit prevDeposit;
        for (int i=1; i<depositsList.size();i++) {
            prevDeposit = (Deposit)depositsList.get(i - 1);
            deposit = (Deposit)depositsList.get(i);
            if (prevDeposit.sum < userDepositSum && deposit.sum >= userDepositSum) {
                index = i;
            }
        }

        return index;
    }
}
