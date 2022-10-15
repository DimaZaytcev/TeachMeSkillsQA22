package MnogomernieMassivi;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        System.out.println("Введите размер матрицы: ");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        n = sc.nextInt();

        int[][] mas = new int[n][n];
        int sum = 0;
        int a = 0;
        int pr = 1;
        int pr1 = 1;
        int sumN = 0;
        int N;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) Math.round((Math.random() * 50));
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] % 2 == 0) {
                sum = sum + mas[i][i];
            }
        }
        System.out.println("Сумма четных элементов главной диагонали матрица: " + sum);

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (mas[i][i] % 2 > 0){
                a = a + 1;
            }
        }
        System.out.print("Нечетные элементы находящиеся под главной диагональю: " + a);

        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            pr = pr * mas[i][i];
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == mas.length - i - 1) {
                    pr1 = pr1 * mas[i][j];
                }
            }
        }
        System.out.println("Произведение числен главной диагонали: " + pr);
        System.out.println("Прозведение числел побочной диагонали: " + pr1);

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == mas.length - i - 1) {
                    N = mas[i][j];
                    if (N % 2 == 0) {
                        sumN = sumN + N;
                    }
                }
            }
        }
        System.out.println("Сумма четных элементов побочной диагонали: " + sumN);

        System.out.println();
        System.out.println("Номая матрица");
        System.out.println("------------");

        for (int i = 0; i < mas.length; i++) {
            for (int j = i + 1; j < mas[i].length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
