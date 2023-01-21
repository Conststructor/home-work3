package top.academy;

import java.util.Scanner;

public class Book {

    private String name;
    private String author;
    private String genre;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    Book() {
        setName("unknown");
        setAuthor("John Doe");
        setPages(0);
        setGenre("unknown");
    }

    Book(String name, String author, String genre, int pages) {
        setName(name);
        setAuthor(author);
        setGenre(genre);
        setPages(pages);
    }

    public void changeInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название книги");
        setName(input.next());
        System.out.println("Введите жанр");
        setGenre(input.next());
        System.out.println("Введите автора");
        setAuthor(input.next() + " " + input.next());
        System.out.println("Введите количество страниц");
        setPages(input.nextInt());
    }

    public void changeInfo(String name, String author, String genre, int pages) {
        setName(name);
        setAuthor(author);
        setGenre(genre);
        setPages(pages);
    }

    public void showInfo() {
        System.out.println(getGenre() + " \"" + getName() + "\" автора " + getAuthor() + " в " + getPages() + " стр");
    }
}
