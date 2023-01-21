package top.academy;

import java.util.Scanner;

public class State {
    private String capitalName;
    private String stateName;
    private int cityNumber;
    private int population;
    public String getStateName() {
        return capitalName;
    }

    public void setStateName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getDiscription() {
        return stateName;
    }

    public void setDiscription(String stateName) {
        this.stateName = stateName;
    }

    public int getStateNumber() {
        return cityNumber;
    }

    public void setStateNumber(int cityNumber) {
        this.cityNumber = cityNumber;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    State() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        this.capitalName = input.next();
        System.out.println("Введите фамилию");
        this.stateName = input.next();
        System.out.println("Введите пол");
        this.cityNumber = input.nextInt();
        System.out.println("Введите возраст");
        this.population = input.nextInt();
    }

    State(String capitalName, String stateName) {
        this.capitalName = capitalName;
        this.stateName = stateName;
        this.cityNumber = 0;
        this.population = 0;
    }

    State(String capitalName, String stateName, int cityNumber, int population) {
        this.capitalName = capitalName;
        this.stateName = stateName;
        this.cityNumber = cityNumber;
        this.population = population;
    }


    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название города");
        this.capitalName = input.next();
        System.out.println("Введите описание города");
        this.stateName = input.next();
        System.out.println("Введите номер города");
        this.cityNumber = input.nextInt();
        System.out.println("Введите население");
        this.population = input.nextInt();
    }


    public void changeInfo(String capitalName, String stateName) {
        setStateName(capitalName);
        setDiscription(stateName);
    }

    public void changeInfo(String capitalName, String stateName, int cityNumber, int population) {
        setStateName(capitalName);
        setDiscription(stateName);
        setStateNumber(cityNumber);
        setPopulation(population);
    }

    public void showInfo() {
        System.out.println("Город : " + getStateName() + "\nИндекс № " + getStateNumber());
        System.out.println("Население : " + getPopulation()+"чел");
        System.out.println("Описание: " + getDiscription() + "\n");
    }
}
