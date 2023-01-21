package top.academy;

import java.util.Scanner;

public class City {
    private String cityName;
    private String discription;
    private int cityNumber;
    private int population;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getCityNumber() {
        return cityNumber;
    }

    public void setCityNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    City() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название города");
        this.cityName = input.next();
        System.out.println("Введите описание города");
        this.discription = input.next();
        System.out.println("Введите номер города");
        this.cityNumber = input.nextInt();
        System.out.println("Введите население");
        this.population = input.nextInt();
    }

    City(String cityName, String discription) {
        this.cityName = cityName;
        this.discription = discription;
        this.cityNumber = 0;
        this.population = 0;
    }

    City(String cityName, String discription, int cityNumber, int population) {
        this.cityName = cityName;
        this.discription = discription;
        this.cityNumber = cityNumber;
        this.population = population;
    }


    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название города");
        this.cityName = input.next();
        System.out.println("Введите описание города");
        this.discription = input.next();
        System.out.println("Введите номер города");
        this.cityNumber = input.nextInt();
        System.out.println("Введите население");
        this.population = input.nextInt();
    }


    public void changeInfo(String cityName, String discription) {
        setCityName(cityName);
        setDiscription(discription);
    }

    public void changeInfo(String cityName, String discription, int cityNumber, int population) {
        setCityName(cityName);
        setDiscription(discription);
        setCityNumber(cityNumber);
        setPopulation(population);
    }

    public void showInfo() {
        System.out.println("Город : " + getCityName() + "\nИндекс № " + getCityNumber());
        System.out.println("Население : " + getPopulation() + "чел");
        System.out.println("Описание: " + getDiscription() + "\n");
    }
}
