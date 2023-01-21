package top.academy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

       Automobiles book = new Automobiles("Нива-3", "JACтоваз",2022,2);

       book.showInfo();
       book.setEngineVolume(2.5F);
       book.showInfo();
       book.changeInfo("Truck-SX", "Tesla",2023 ,0);
       book.showInfo();
       book.changeInfo();
       book.showInfo();
    }
}
