package epam.javatutor.module4.task12;

/* Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
         менять колесо, вывести на консоль марку автомобиля.*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList <Car> listCar = new ArrayList<>();

        Car car1 = new Car("Opel Vectra", new Engine(2,"AI-92",10.25),new Wheel(18),15,50);
        Car car2 = new Car("Audi A4", new Engine(3,"DT",8.25),new Wheel(17),16.5, 65);
        Car car3 = new Car("Ford Galaxy", new Engine(1,"AI-95",12.50),new Wheel(15),12.5, 80);
        Car car4 = new Car("Chevrolet Cruse", new Engine(2,"AI-98",9.50),new Wheel(16),15.5, 100);
        Car car5 = new Car("GAZ 323303", new Engine(2,"AI-95",11.20),new Wheel(19),14.5, 95);

        listCar.add(car1);
        listCar.add(car2);
        listCar.add(car3);
        listCar.add(car4);
        listCar.add(car5);


        do {
            Logic.choiceUser(Logic.choiceCar(listCar), listCar);
        } while (Logic.repeatAction());

    }
}