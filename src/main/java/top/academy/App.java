package top.academy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        State city = new State("CCCP", "Москва", 22402200 , 293047571);

        city.showInfo();
        city.changeInfo("Россия", "Москва", 17125191, 147182123);
        city.showInfo();
        city.changeInfo();
        city.showInfo();
    }
}
