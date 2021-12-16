package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        Author alexeyVasilev = new Author("Алексей", "Васильев");
        Author kenKouzen = new Author("Кен", "Коузен");
        Book javaForAll = new Book("Java для всех", alexeyVasilev, 2019);
        Book modernJava = new Book("Современный Java", kenKouzen, 2019);
        modernJava.setYearOfPublishing(2017);
        System.out.println(javaForAll.getYearOfPublishing());
        System.out.println(modernJava.getYearOfPublishing());
        System.out.println(modernJava.getAuthor());
        System.out.println(javaForAll.getName());
    }
}
