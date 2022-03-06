package epam.javatutor.module4.task3;

import java.util.Arrays;

/*Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
        из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
        номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {
    public static void main(String[] args) {

        Student [] students = new Student[10];

        students [0] = new Student("Vag Hokit", 13, formationArray(5));
        students [1] = new Student("Kol Tolik", 12, formationArray(5));
        students [2] = new Student("Pol Waker", 15, formationArray(5));
        students [3] = new Student("Vin Dizel", 23, formationArray(5));
        students [4] = new Student("Hot Likot", 13, formationArray(5));
        students [5] = new Student("Ivan Ivanov", 11, formationArray(5));
        students [6] = new Student("Masha Rodiko", 12, formationArray(5));
        students [7] = new Student("Sasha Tiruh", 22, formationArray(5));
        students [8] = new Student("Masha Lokid", 15, formationArray(5));
        students [9] = new Student("Ivan Golem", 22, formationArray(5));


        System.out.println();
        System.out.println("List of all students: ");
        for (Student elem : students){
            System.out.println("Full Name: " + elem.fullName + " Group number: " +elem.groupNumber +
                    " Academic performance: "+ Arrays.toString(elem.academicPerformance));
        }

        System.out.println();
        System.out.println("Excellent students: ");
        for (Student student : students) {
            if (excellentStudents(student.academicPerformance)) {
                System.out.println("Full Name: " + student.fullName + " Group number: " + student.groupNumber +
                        " Academic performance: " + Arrays.toString(student.academicPerformance));
            }
        }
    }

    public static int [] formationArray (int lenght){
        int [] academicPerformance = new int [lenght];
        for (int i = 0; i < academicPerformance.length; i++) {
            academicPerformance[i]= (int) (Math.random()*(10-5))+6;
        }
        return academicPerformance;
    }

    public static boolean excellentStudents (int [] academicPerformance){
        boolean result = true;
        for (int grade : academicPerformance) {
            if (grade < 9) {
                result = false;
                break;
            }
        }

        return result;
    }
}