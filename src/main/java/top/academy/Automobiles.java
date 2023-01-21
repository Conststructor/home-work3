package top.academy;

import java.util.Scanner;

public class Automobiles {

    private String name;
    private String manufacturer;
    private int reliseYear;
    private float engineVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getReliseYear() {
        return reliseYear;
    }

    public void setReliseYear(int reliseYear) {
        this.reliseYear = reliseYear;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    Automobiles() {
        setName("unknown");
        setManufacturer("unknown");
        setEngineVolume(0);
        setReliseYear(0);
    }

    Automobiles(String name, String manufacturer, int reliseYear, float engineVolume) {
        setName(name);
        setManufacturer(manufacturer);
        setReliseYear(reliseYear);
        setEngineVolume(engineVolume);
    }

    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название авто");
        setName(input.next());
        System.out.println("Введите производителя");
        setManufacturer(input.next());
        System.out.println("Введите год выпуска");
        setReliseYear(input.nextInt());
        System.out.println("Введите объём двигателя");
        setEngineVolume(input.nextInt());
    }

    public void changeInfo(String name, String manufacturer, int reliseYear, float engineVolume) {
        setName(name);
        setManufacturer(manufacturer);
        setReliseYear(reliseYear);
        setEngineVolume(engineVolume);
    }

    public void showInfo() {
        System.out.println(getName() + " от компании " + getManufacturer() + " " + getReliseYear() + " года выпуска с " +
                getEngineVolume() + " см3 объмом двигателя");
    }
}
