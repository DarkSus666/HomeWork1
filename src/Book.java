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
}
