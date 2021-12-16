package ru.skystudent;

public class Book {
    private final String name;
    private final Author author;
    private int yearOfPublishing;

    public Book(String name, Author author, int yearOfPublishing) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor(){
        return this.author.getFirstName() + " " + this.author.getLastName();
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
}

