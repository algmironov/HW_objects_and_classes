package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        Author alexeyVasilev = new Author("Алексей", "Васильев");
        Author kenKouzen = new Author("Кен", "Коузен");
        Book javaForAll = new Book("Java для всех", alexeyVasilev, 2019);
        Book modernJava = new Book("Современный Java", kenKouzen, 2019);


        Object[] books = {javaForAll, modernJava};

        printBooks(books);

        System.out.println(books[1].toString());

        modernJava.setYearOfPublishing(2017);

    }

    public static void printBooks(Object[] books) {
        for (Object book : books) {
            System.out.println(book.toString());
        }
    }
}



