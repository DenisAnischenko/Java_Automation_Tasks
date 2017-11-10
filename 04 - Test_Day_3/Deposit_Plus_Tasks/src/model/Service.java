package model;

import model.exceptions.*;

import java.util.ArrayList;

public class Service {

    private int depositSum;
    private int depositTerm;

    public int getDepositSum() {
        return depositSum;
    }

    public int getDepositTerm() {
        return depositTerm;
    }

    public void setDepositSum(int sum) throws SumLessZeroException, SumExceedsLimitException {
        if (sum > 500) throw new SumExceedsLimitException();
        if (sum <= 0) throw new SumLessZeroException();
        depositSum = sum;
    }

    public void setDepositTerm(int term) throws TermExceedsLimitException, TermLessThanMinimumException {
        if (term > 12) throw new TermExceedsLimitException();
        if (term < 3) throw new TermLessThanMinimumException();
        depositTerm = term;
    }

    public String getDepositList(Bank[] banks) throws NoOffersFoundException {
        ArrayList<Bank> banksThatFit = new ArrayList<>();
        for (Bank b : banks) {
            if (depositSum <= b.getMaximumDeposit() &&
                    depositSum >= b.getMinimumDeposit()) {
                banksThatFit.add(b);
            }
        }

        if (banksThatFit.size() == 0) throw new NoOffersFoundException();

        String result = "";


        for (Bank b : banksThatFit) {
            result += b.getName() + " банк предоставляет депозит под ";
            if (depositTerm > 2 && depositTerm < 6) result += b.getRate3Months();
            else if (depositTerm > 5 && depositTerm < 7) result += b.getRate6Months();
            else if (depositTerm > 6 && depositTerm < 13) result += b.getRate12Months();
            result += "%\n";
        }

        return result;
    }

}
