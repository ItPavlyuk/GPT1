package G.Lesson1;

import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем контакты только один раз при запуске программы
        Contact contact1 = new Contact("Иван", "Иванов", "ivan@example.com", 123456789);
        Contact contact2 = new Contact("Петр", "Петров", "petr@example.com", 987654321);
        phoneBook.addContact(contact1);
        phoneBook.addContact(contact2);

        while (true) {
            System.out.println("Введите что хотите сделать:");
            System.out.println("1: Посмотреть контакты");
            System.out.println("2: Найти контакт");
            System.out.println("3: Добавить контакт");
            System.out.println("4: Удалить контакт");
            System.out.println("5: Выйти из системы");

            byte choice = scanner.nextByte();
            scanner.nextLine(); // Считываем символ новой строки после ввода числа

            switch (choice) {
                case 1:
                    System.out.println("Все контакты:");
                    List<Contact> allContacts = phoneBook.getAllContacts();
                    for (Contact contact : allContacts) {
                        System.out.println(contact); // используем метод toString()
                    }
                    break;

                case 2:
                    System.out.println("Введите имя контакта для поиска:");
                    String searchName = scanner.nextLine();
                    Contact foundContact = phoneBook.searchContact(searchName);
                    if (foundContact != null) {
                        System.out.println("Найден контакт: " + foundContact); // используем метод toString()
                    } else {
                        System.out.println("Контакт не найден.");
                    }
                    break;

                case 3:
                    System.out.println("Введите имя:");
                    String firstName = scanner.nextLine();
                    System.out.println("Введите фамилию:");
                    String lastName = scanner.nextLine();
                    System.out.println("Введите email:");
                    String email = scanner.nextLine();
                    System.out.println("Введите номер телефона:");
                    int phoneNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    Contact newContact = new Contact(firstName, lastName, email, phoneNumber);
                    phoneBook.addContact(newContact);
                    System.out.println("Контакт успешно добавлен.");
                    break;

                case 4:
                    System.out.println("Введите имя контакта для удаления:");
                    String deleteName = scanner.nextLine();
                    phoneBook.removeContact(deleteName);
                    System.out.println("Контакт успешно удален.");
                    break;

                case 5:
                    System.out.println("Программа завершена");
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}