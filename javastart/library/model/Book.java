package pl.javastart.library.model;

import java.util.Objects;

public class Book extends Publication {
    public static final String TYPE = "Książka";

    @Override
    public String toCsv() {
        return (TYPE + ";") +
                getTitle() + ";" +
                getPublisher() + ";" +
                getYear() + ";" +
                author + ";" +
                pages + ";";
    }

    // Pola klasy

    private String author;
    private int pages;
    private String isbnNumber;

    // Konstruktory

    public Book(String title, String author, int year, int pages, String publisher, String ISBN) {
        super(title, publisher, year);
        this.author=author;
        this.pages=pages;
        this.isbnNumber = ISBN;
    }

    public Book(String title, String author, int year, int pages, String publisher) {
        super(title, publisher, year);
        this.author=author;
        this.pages=pages;
    }

// Gettery i settery



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author) && Objects.equals(isbnNumber, book.isbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbnNumber);
    }

    @Override
    public String toString() {
        return author + ", " + pages +
                ", " + isbnNumber;
    }
}
