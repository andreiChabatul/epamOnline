package epam.javatutor.module2;

import java.util.Arrays;
import java.util.Scanner;

public class task17 {

/*    В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.*/

    public static void main(String[] args) {
        int n = 4;
        int[][] mas = new int[n][n];
        int columnone;
        int columntwo;
        int defaultone;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter column one: ");
        columnone = scan.nextInt();
        System.out.print("Enter column two: ");
        columntwo = scan.nextInt();

        if (columnone < 0 || columnone > (n-1) || columntwo < 0 || columntwo > (n-1)){
            System.out.println("Invalid column numbers specified");
        }
        else {

            for (int j = 0; j < mas.length; j++) {
                for (int i = 0; i < n; i++) {
                    mas[j][i] = (int) (Math.random() * 1500);
                }
            }

            System.out.println(Arrays.deepToString(mas));

            for (int i = 0; i < mas.length; i++) {
                defaultone = mas[i][columnone];
                mas[i][columnone] = mas[i][columntwo];
                mas[i][columntwo] = defaultone;


            }
            System.out.println(Arrays.deepToString(mas));
        }
    }
}