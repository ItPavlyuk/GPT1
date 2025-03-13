package GPT.lesson3;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Снято " + amount + " с счета " + getAccountNumber());
        } else {
            System.out.println("Недостаточно средств на счете " + getAccountNumber());
        }
    }

    @Override
    public String toString() {
        return "Информация об аккаунте: " + '\n' +
                "Номер счёта: " + getAccountNumber() + '\n' +
                "Баланс: " + getBalance() +
                ", лимит овердрафта: " + overdraftLimit;
    }
}
