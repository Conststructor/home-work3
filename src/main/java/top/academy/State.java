package top.academy;

import java.util.Scanner;

public class State {
    private String stateName;
    private String capitalName;
    private int stateArea;
    private int population;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public int getStateArea() {
        return stateArea;
    }

    public void setStateArea(int stateArea) {
        this.stateArea = stateArea;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    State() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название государства");
        this.stateName = input.next();
        System.out.println("Введите название столицы");
        this.capitalName = input.next();
        System.out.println("Введите занимаемую площадь государства");
        this.stateArea = input.nextInt();
        System.out.println("Введите население");
        this.population = input.nextInt();
    }

    State(String stateName, String capitalName) {
        this.stateName = stateName;
        this.capitalName = capitalName;
        this.stateArea = 0;
        this.population = 0;
    }

    State(String stateName, String capitalName, int stateArea, int population) {
        this.stateName = stateName;
        this.capitalName = capitalName;
        this.stateArea = stateArea;
        this.population = population;
    }


    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название государства");
        this.stateName = input.next();
        System.out.println("Введите название столицы");
        this.capitalName = input.next();
        System.out.println("Введите занимаемую площадь государства");
        this.stateArea = input.nextInt();
        System.out.println("Введите население");
        this.population = input.nextInt();
    }


    public void changeInfo(String stateName, String capitalName) {
        setStateName(stateName);
        setCapitalName(capitalName);
    }

    public void changeInfo(String stateName, String capitalName, int stateArea, int population) {
        setStateName(stateName);
        setCapitalName(capitalName);
        setStateArea(stateArea);
        setPopulation(population);
    }

    public void showInfo() {
        System.out.println("Государство : " + getStateName() + "\nСтолица : " + getCapitalName());
        System.out.println("Население : " + getPopulation() + " чел");
        System.out.println("Занимаемая площадь : " + getStateArea() + " км2\n");
    }
}
