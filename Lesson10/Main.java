package G.Lesson10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> booklist = new ArrayList<>();

        Author author1 = new Author("Лев", "Толстой", "Романист");
        Author author2 = new Author("Александр", "Пушкин", "Поэт");
        Author katysierra = new Author("Катя", "Сьерра", "Автор книг по Java");
        Author bertBates = new Author("Берт", "Бейтс", "Автор книг по Java");
        Author pavlyuk = new Author("Александр", "Павлюченко", "Мастер по Java");

        Book book1 = new Book("Война и мир", new Author[]{author1}, 1869);
        Book book2 = new Book("Евгений Онегин", new Author[]{author2}, 1833);
        Book book3 = new Book("Изучаем Java", new Author[]{katysierra, bertBates}, 2011);
        Book book4 = new Book("На какой версии Java я заработал на Bentley?", new Author[]{pavlyuk}, 2035);

        Library library_programming = new Library("Библиотека \\программирование\\");
        library_programming.addBook(book3);
        library_programming.addBook(book4);

        Library library_central = new Library("Центральная библиотека");
        library_central.addBook(book1);
        library_central.addBook(book2);
        library_central.addBooks(library_programming.getBooks());

        library_central.printBooks();
        library_central.getBookCountPrint();
        library_central.addBooks(library_zoo.getBooks());
    }
}