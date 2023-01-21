package top.academy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

       Book book = new Book("Дюна", "Френк Герберт","Фантастика",650);

       book.showInfo();
       book.setPages(750);
       book.showInfo();
       book.changeInfo();
       book.showInfo();
    }
}
