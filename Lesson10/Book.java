package G.Lesson10;

public class Book {
    private String name;
    private Author[] author;
    private int yearOfIssuue;

    public Book() {
    }

    public Book(String name, Author[] author, int yearOfIssuue) {
        this.name = name;
        this.author = author;
        this.yearOfIssuue = yearOfIssuue;
    }

    public Book(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        if (author != null && author.length == 1) {
            return "Название: " + name +
                    ", Автор: " + getAuthorsString() +
                    ", Год издания: " + getYearOfIssuue() + "\n";
        } else {
            return "Название: " + name +
                    ", Авторы: " + getAuthorsString() +
                    ", Год издания: " + getYearOfIssuue() + "\n";
        }
    }

    // Вспомогательный метод для получения строки с именами авторов
    private String getAuthorsString() {
        StringBuilder sb = new StringBuilder();
        if (author != null) {
            for (int i = 0; i < author.length; i++) { // перебираем автором
                sb.append(author[i].getName()).append(" ").append(author[i].getLastName());
                if (i < author.length - 1) { // если это не последний автор, то ставим запятую
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }
    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public int getYearOfIssuue() {
        return yearOfIssuue;
    }
    public void setYearOfIssuue(int yearOfIssuue) {
        this.yearOfIssuue = yearOfIssuue;
    }

}
