package epam.javatutor.module4.task8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int choise;
        boolean check = true;
        String checking;
        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Customer customer = new Customer(235,"Ivan Ivanov","Ukraine",256325,256365);
        Customer customer1 = new Customer(226,"Andrei Kolin","Belarus",259562,124597);
        Customer customer2 = new Customer(315,"Petr Solok","Russia",256412,325641);
        customerArrayList.add(customer);
        customerArrayList.add(customer1);
        customerArrayList.add(customer2);

        Comparator <Customer> customerFIOComparator = Comparator.comparing(Customer::getFIO);


        while (check) {
            System.out.println("Choose the desired action: ");
            System.out.println("1. View customer list.");
            System.out.println("2. Add a customer.");
            System.out.println("3. Sort buyers alphabetically");
            System.out.println("4. View a list of customers who have a credit card number within a given range");
            System.out.println();
            System.out.print("Your choice: ");
            choise = enterNumber();
            switch (choise){
                case 1 -> viewListCustomer(customerArrayList);
                case 2 -> customerArrayList.add(createCustomer());
                case 3 -> customerArrayList.sort(customerFIOComparator);
                case 4 -> sortNumberCard(customerArrayList);
            }
            System.out.println("Want to continue?");
            System.out.println("Enter Yes or No.");
            checking = enterString();
            if (!Objects.equals(checking, "Yes")){
                check = false;
            }
        }
    }

    public static void sortNumberCard(ArrayList<Customer> customerArrayList) {
        int minrange;
        int maxrange;
        int check = 0;

        System.out.println("Enter the minimum and maximum range to search.");
        System.out.print("Enter minrange: ");
        minrange = enterNumber();
        System.out.print("Enter maxrange: ");
        maxrange = enterNumber();

        for (Customer customer : customerArrayList) {
            if (customer.getNumberCard() > minrange && customer.getNumberCard() < maxrange) {
                System.out.println(customer);
                check++;
            }
        }
        if (check == 0){
            System.out.println("The customer with the specified range of cards does not exist.");
        }
    }
    public static Customer createCustomer (){
        System.out.println("Create new customer:" );
        System.out.print("Enter Id: ");
        int Id = (enterNumber());
        System.out.print("Enter FIO: ");
        String FIO = enterString();
        System.out.print("Enter address: ");
        String address = enterString();
        System.out.print("Enter number card: ");
        int numberCard = enterNumber();
        System.out.print("Enter Banking Account: ");
        int numberBankingAccount =enterNumber();
        return new Customer(Id,FIO,address,numberCard,numberBankingAccount);
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
    public static void viewListCustomer (ArrayList<Customer> customerArrayList){
        for (Object customer : customerArrayList) {
            System.out.println(customer);
        }
    }
}