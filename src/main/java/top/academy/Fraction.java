package top.academy;

import java.util.Scanner;

public class Fraction {

    private int nominator;
    private int denominator;

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    Fraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числитель");
        this.nominator = input.nextInt();
        System.out.println("Введите знаменатель");
        this.denominator = input.nextInt();
    }

    Fraction(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }


    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите числитель");
        this.nominator = input.nextInt();
        System.out.println("Введите знаменатель");
        this.denominator = input.nextInt();
    }


    public void changeInfo(int nominator, int denominator) {
        setNominator(nominator);
        setDenominator(denominator);
    }

    public void showInfo() {
        System.out.println(getNominator() + "/" + getDenominator());
    }
}
