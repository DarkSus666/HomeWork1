public class Main {
    public static void main(String[] args) {
        Author bulgakov = new Author("Михаил", "Булгаков");
        Author pushkin = new Author("Александр", "Пушкин");
        Book master = new Book("Мастер и Маргарита", bulgakov, 1990);
        Book onegin = new Book("Евгений Онегин", pushkin, 1974);

        master.setYear(2000);
    }
}