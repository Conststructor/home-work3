package top.academy;

import java.util.Scanner;

public class Human {
    private String firstName;
    private String surName;
    private String gender;
    private int years;

    Human() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        this.firstName = input.next();
        System.out.println("Введите фамилию");
        this.surName = input.next();
        System.out.println("Введите пол");
        this.gender = input.next();
        System.out.println("Введите возраст");
        this.years = input.nextInt();
    }

    Human(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = "";
        this.years = 0;
    }

    Human(String firstName, String surName, String gender, int years) {
        this.firstName = firstName;
        this.surName = surName;
        this.gender = gender;
        this.years = years;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя");
        this.firstName = input.next();
        System.out.println("Введите фамилию");
        this.surName = input.next();
        System.out.println("Введите пол");
        this.gender = input.next();
        System.out.println("Введите возраст");
        this.years = input.nextInt();
    }

    public void changeInfo(String firstName, String surName) {
        setFirstName(firstName);
        setSurName(surName);
    }

    public void changeInfo(String firstName, String surName, String gender, int years) {
        setFirstName(firstName);
        setSurName(surName);
        setGender(gender);
        setYears(years);
    }

    public void showInfo() {
        System.out.println("Имя : " + getFirstName() + " " + getSurName());
        System.out.println("Пол : " + getGender());
        System.out.println("Возраст : " + getYears() + "\n");
    }
}
