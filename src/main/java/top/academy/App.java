package top.academy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Fraction city = new Fraction(16 , 2);

        city.showInfo();
        city.changeInfo(40, 5);
        city.showInfo();
        city.changeInfo();
        city.showInfo();
    }
}
