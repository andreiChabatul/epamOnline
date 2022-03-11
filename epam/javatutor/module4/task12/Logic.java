package epam.javatutor.module4.task12;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic {

    public static double remainingRun (Car car){
        return (car.getScopeFuel()*100)/car.getEngine().getFuelConsumption();
    }
    public static void refullingCar (Car car){
        double fillingVolume;

        System.out.println("The tank has " + car.getScopeFuel() + " L");
        System.out.println("The maximum amount of fuel that can be filled "+(car.getTankVolume()-car.getScopeFuel()));
        System.out.print("Enter the desired filling volume: ");
        fillingVolume = enter();
        car.setScopeFuel(car.getScopeFuel() + fillingVolume);
        if (car.getScopeFuel() > car.getTankVolume()){{
            car.setScopeFuel(car.getTankVolume());
        }
        }
        System.out.println("The volume of fuel in the tank is " + car.getScopeFuel());
    }
    public static double enter() {
        double x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();

        return x;
    }
    public static void driveByCar (Car car){
        double drive;

    System.out.println("You can drive on the available fuel: " + remainingRun(car));
    System.out.print("Enter desired distance: ");
    drive = enter();
    car.setScopeFuel(car.getScopeFuel()-((drive*car.getEngine().getFuelConsumption())/100));
    if (remainingRun(car)<0){
        System.out.println("You ran out of fuel.");
    }
    else {
        System.out.println("You can drive on the available fuel: " + remainingRun(car));
    }
}
    public static void wheelReplacement (Car car){
    System.out.println("Do you have wheels with a radius: " + car.getWheel().getWheelSize());
    System.out.print("What radius do you want to replace them with: ");
    double size = enter();
    if (size < 1) {
        System.out.println("Radius cannot be less than zero.");
    }
    else{
        car.getWheel().setWheelSize(size);
    }
    System.out.println("Do you have wheels with a radius: " + car.getWheel().getWheelSize());
}
    public static void viewCar (Car car){
        System.out.println("Car model: " + car.getModel());
        System.out.println("Engine volume: " + car.getEngine().getScope() + "L");
        System.out.println("Fuel type: " + car.getEngine().getFuelGrade());
        System.out.println("Fuel consumption per 100 km: " + car.getEngine().getFuelConsumption());
        System.out.println("Fuel tank volume: " + car.getTankVolume() + "L");
        System.out.println("Wheel radius: " + car.getWheel().wheelSize);
}
    public static String enterString() {
        String x;

        Scanner scan = new Scanner(System.in);
        x = scan.nextLine();

        return x;
    }
    public static boolean repeatAction (){
        boolean check = true;
        String cheking;

        System.out.println("Would you like to continue?");
        System.out.print("Enter Yes to continue: ");
        cheking = enterString();
        if (!cheking.equals("Yes")){
            check = false;
        }
        return check;
    }
    public static void choiceUser (Car car, ArrayList <Car> listCar){
        int choice;
        System.out.println();
        System.out.println("The following actions are available to you:");
        System.out.println("1. View vehicle specifications.");
        System.out.println("2. Drive a car.");
        System.out.println("3. Refuel the car.");
        System.out.println("4. Change wheel.");
        System.out.println("5. Choice car.");
        System.out.print("Your choice: ");
        choice = (int) enter();
        switch (choice){
            case 1 -> viewCar(car);
            case 2 -> driveByCar(car);
            case 3 -> refullingCar(car);
            case 4 -> wheelReplacement(car);
            case 5 -> choiceCar(listCar);
        }
    }
    public static Car choiceCar (ArrayList <Car> listCar) {
        Car car = null;
        int choise;

        System.out.println("list of available cars. ");
        for (int i = 0; i < listCar.size(); i++) {
            System.out.println((i+1) + ". " + listCar.get(i).getModel());
        }
        System.out.print("Your choice: ");
        choise = (int) enter();

            if (choise > listCar.size() || choise < 0){
                System.out.println("There are no cars with this number.");
            }
            else {
                    car = listCar.get(choise-1);
            }

        assert car != null;
        System.out.println("You have selected the following car: " + car.getModel());
            return car;
        }
    }