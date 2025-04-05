import java.util.Objects;

public class Book {
    private String title;
    private Author name;
    private int year;

    public Book(String title, Author name, int year) {
        this.name = name;
        this.title = title;
        this.year = year;
    }

    public Author getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, name, year);
    }

    @Override
    public String toString() {
        return "'" + title + "', " + name + ", " + year;
    }
}
