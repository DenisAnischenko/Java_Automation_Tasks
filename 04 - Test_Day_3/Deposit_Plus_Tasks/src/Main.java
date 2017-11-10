import model.Bank;
import presenter.Consultant;

public class Main {

    public static void main(String[] args) {
        Consultant consultant = new Consultant();
        consultant.setDepositSum();
        consultant.setDepositTerm();
        consultant.lookForOptions(getListOfBanks());
    }

    private static Bank[] getListOfBanks() {
        return new Bank[] {
                new Bank("MT", 100,500,2.75,
                        3.15, 3.30),
                new Bank("VTB", 50,500,1.75,
                        2.15, 3.0),
                new Bank("Alfa", 10,500,1.12,
                        1.75, 2.15),
                new Bank("Tinkoff", 5,500,0.5,
                        1.35, 2.12),
                new Bank("BSB", 400,500,1.5,
                        1.8, 2.2)
        };
    }

}
