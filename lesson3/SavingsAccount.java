package G.lesson3;

/*
  Класс отвечающий за сберегательный счёт.
 */
public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //Тут снимает деньги со сберегательного счёта
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("Снято " + amount + " с сберегательного счета " + getAccountNumber());
        } else {
            System.out.println("Недостаточно средств на сберегательном счете " + getAccountNumber());
        }
    }

    // Тут начисляются проценты на сберегательный счёт
    public void addInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Начислены проценты на сберегательный счет " + getAccountNumber() + ". Начислено " + interest);
    }
//    public String infoSavings(){
//        String infoBalanceSavings = "Номер сберегательного счета: " + savingsAccountNumber + "\n" +
//                "Начальный баланс для сберегательного счета: " + savingsBalance + "\n" +
//                "Процентная ставка для сберегательного счета " + savingsInterestRate;
//        return infoBalanceSavings;
//    }
}
