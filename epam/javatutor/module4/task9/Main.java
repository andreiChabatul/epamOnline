package epam.javatutor.module4.task9;

import java.util.ArrayList;
import java.util.Scanner;

/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
        метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.*/

public class Main {

    public static void main(String[] args) {

        boolean check = true;
        int choise;
        String cheking;
        ArrayList<Book> bookList = new ArrayList<>();


        Book book = new Book(1,"Jane Austen", 1955,"Styria Pichler Verlag", 350, 15, "Hard cover");
        Book book1 = new Book(2,"Philip Pullman",1992, "Accordia Publishe", 550, 1210, "Hard cover");
        bookList.add(book);
        bookList.add(book1);

        while (check){
            System.out.println("Choose the desired action: ");
            System.out.println("1. View book list.");
            System.out.println("2. Add a book.");
            System.out.println("3. View a list of books by a given author");
            System.out.println("4. View a list of books published by a given publisher");
            System.out.println("5. View a list of books released after a given year");
            System.out.println();
            System.out.print("Your choice: ");
            choise = enterNumber();
            switch (choise){
                case 1 -> viewListBook(bookList);
                case 2 -> bookList.add(createBook());
                case 3 -> searchAuthors(bookList);
                case 4 -> searchPublisher(bookList);
                case 5 -> searchYear(bookList);
            }
            System.out.println("Want to continue?");
            System.out.println("Enter Yes or No.");
            cheking = enterString();
            if (!cheking.equals("Yes")){
                check = false;
            }
        }
    }

    public static Book createBook (){
        System.out.println("Create new customer:" );
        System.out.print("Enter Id: ");
        int id = (enterNumber());
        System.out.print("Enter authors: ");
        String authors = enterString();
        System.out.print("Enter Year: ");
        int year = (enterNumber());
        System.out.print("Enter publisher: ");
        String publisher = enterString();
        System.out.print("Enter page count: ");
        int pageCount = enterNumber();
        System.out.print("Enter price: ");
        int price = enterNumber();
        System.out.print("Enter binding type: ");
        String bindingType = enterString();
        return new Book(id,authors,year,publisher,pageCount,price,bindingType);
    }
    public static int enterNumber() {
        int x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        return x;
    }
    public static String enterString() {
        String x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextLine();

        return x;
    }
    public static void viewListBook (ArrayList<Book> bookList){
        for (Object book : bookList) {
            System.out.println(book);
        }
    }
    public static void searchAuthors (ArrayList<Book> bookList){
        String author;
        int check = 0;

        System.out.println("A list of books written by a given author.");
        System.out.print("Enter author Information: ");
        author = enterString();

        for (Book book : bookList) {
            if (book.getAuthors().equals(author)) {
                System.out.println(book);
                check++;
            }
        }
        if (check == 0){
            System.out.println("There are no books published by this author in the list.");
        }
    }
    public static void searchYear (ArrayList<Book> bookList){
        int year;
        int check = 0;

        System.out.print("Enter year of manufacture: ");
        year = enterNumber();
        System.out.println("list of books released after a given year: ");
        for (Book book : bookList) {
            if (book.getYear() > year) {
                System.out.println(book);
                check++;
            }
        }
        if (check==0){
            System.out.println("There are no books published after the given year in the list.");
        }
    }
    public static void searchPublisher (ArrayList<Book> booklist){
        int check = 0;
        String publisher;

        System.out.print("Enter publisher: ");
        publisher = enterString();
        System.out.println("A list of books published by a given publishing house: ");
        for (Book book : booklist) {
            if (publisher.equals(book.getPublisher())) {
                System.out.println(book);
                check++;
            }
        }
        if (check == 0){
            System.out.println("There are no books published by this publisher.");
        }
    }
}