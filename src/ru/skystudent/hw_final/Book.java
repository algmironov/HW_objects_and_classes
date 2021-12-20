package ru.skystudent.hw_final;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Book{" +
                "Название:'" + name + '\'' +
                ", автор:" + author +
                ", год публикации=" + yearOfPublishing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublishing == book.yearOfPublishing && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearOfPublishing);
    }
}

