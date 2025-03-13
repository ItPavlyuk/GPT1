package GPT.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts = new ArrayList<>(); // Коллекция для хранения контактов

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Контакт " + contact.getFirst_name() + " " + contact.getLast_name() + " добавлен.");
    }

    public void removeContact(String name) {
        contacts.removeIf(contact -> contact.getFirst_name().equalsIgnoreCase(name) || contact.getLast_name().equalsIgnoreCase(name));
        System.out.println("Контакт " + name + " удален.");
    }

    public Contact searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirst_name().equalsIgnoreCase(name) || contact.getLast_name().equalsIgnoreCase(name)) {
                return contact; // Возвращаем контакт, если имя совпадает
            }
        }
        return null; // Возвращаем null, если контакт не найден
    }

    public List<Contact> getAllContacts() {
        return contacts; // Возвращаем список всех контактов
    }
}
