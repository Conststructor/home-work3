package top.academy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Human h1 = new Human("John", "Doe", "male", 88);

        h1.showInfo();
        h1.changeInfo("Иван", "Иванов", "мужской", 88);
        h1.showInfo();
        h1.changeInfo();
        h1.showInfo();
    }
}
