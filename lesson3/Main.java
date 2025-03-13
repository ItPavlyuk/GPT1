package GPT.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите тип счета для заполнения:");
        System.out.println("1: Расчётный счёт");
        System.out.println("2: Сберегательный счёт");
        byte accountType = scanner.nextByte();
        scanner.nextLine(); // Очистка буфера после nextByte()

        if (accountType == 1) {
            CheckingAccount checkingAccount = createCheckingAccount(scanner);
            System.out.println(checkingAccount); // Вывод информации о расчетном счете
        } else if (accountType == 2) {
            SavingsAccount savingsAccount = createSavingsAccount(scanner);
            System.out.println(savingsAccount); // Вывод информации о сберегательном счете
        } else {
            System.out.println("Неверный тип счета.");
        }

        scanner.close();
    }

    // Метод для создания CheckingAccount
    private static CheckingAccount createCheckingAccount(Scanner scanner) {
        System.out.print("Введите номер расчетного счета: ");
        String checkingAccountNumber = scanner.nextLine();

        System.out.print("Введите начальный баланс для расчетного счета: ");
        double checkingBalance = scanner.nextDouble();

        System.out.print("Введите лимит овердрафта для расчетного счета: ");
        double checkingOverdraftLimit = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера после nextDouble()

        return new CheckingAccount(checkingAccountNumber, checkingBalance, checkingOverdraftLimit);
    }

    // Метод для создания SavingsAccount
    private static SavingsAccount createSavingsAccount(Scanner scanner) {
        System.out.print("Введите номер сберегательного счета: ");
        String savingsAccountNumber = scanner.nextLine();

        System.out.print("Введите начальный баланс для сберегательного счета: ");
        double savingsBalance = scanner.nextDouble();

        System.out.print("Введите процентную ставку для сберегательного счета (например, 0.05 для 5%): ");
        double savingsInterestRate = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера

        return new SavingsAccount(savingsAccountNumber, savingsBalance, savingsInterestRate);
    }
}
