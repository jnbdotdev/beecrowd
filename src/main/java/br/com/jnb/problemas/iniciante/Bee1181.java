package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1181 extends Problem {

    @Override
    public void problem() {
        setLevel(3);
        setNumber(1181);
        setCategory(Categories.BEGINNER);
        setDescription("Creates an array of values and performs the sum or average of one of its rows");

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        double result = 0;
        char operation = sc.next().toUpperCase().charAt(0);

        double[][] matrix = new double[12][12];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < matrix[row].length; i++) {
            result += matrix[row][i];
        }
        if (operation == 'M') result /= matrix[row].length;


        System.out.printf("%.1f\n", result);
    }
}
