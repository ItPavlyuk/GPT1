package G.Lesson10;

import java.util.ArrayList;
import java.util.List;

/*
 Функции, которые есть:
 1) Поиск книги поназванию
 2) Поиск книги по авторам
 3) Вывод всех книг в библиотеке
 4) Добавление книги
 5) Удаление книги
 */
public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Инициализируем список книг
    }

    // Вывод всех книг в библиотеке
    public void printBooks(){
        int i = 1;
        System.out.println("Вывод всех книг в библиотеке " + "\"" + getName() +  "\"" + ":");
        for (Book book: books){
            System.out.println("Книга " + i + ": " + book);
            i++;
        }
    }

    public List<Book> getBooks(){
        return books;
    }

    // поиск книги по названию
    public Book searchBookByName(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    // поиск книги по авторам
    public Book searchBookByAutor(Author authorToSearch) {
        for (Book book: books) {
            Author[] authors = book.getAuthor(); // Получаем массив авторов книги
            for (Author author : authors) {
                if (author.equals(authorToSearch)) { // Если автор совпадает с запрашиваемым автором
                    return book; // Возвращаем книгу
                }
            }
        }
        return null;
    }

    public void addBooks(List<Book> booksToAdd) {
        this.books.addAll(booksToAdd); // Предполагаем, что books - это ArrayList<Book>
    }

    //Метод для удаления книги
    public void removeBook(Book bookToRemove) {
        books.removeIf(book -> book.getName().equalsIgnoreCase(bookToRemove.getName()) &&
                book.getAuthor()[0].equals(bookToRemove.getAuthor()[0]));
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    // Возвращают количество книг в библиотеке
    public int getBookCount(){
        return books.size();
    }
    public void getBookCountPrint(){
        System.out.println("Количество книг в библиотеке " + "\"" + getName() + "\"" + ": " + getBookCount());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
