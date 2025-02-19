package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1187 extends Problem {

    @Override
    public void problem() {
        setLevel(3);
        setNumber(1187);
        setCategory(Categories.BEGINNER);
        setDescription("Upper Area");

        Scanner sc = new Scanner(System.in);

        char operation = sc.next().toUpperCase().charAt(0);
        double result = 0;
        int div = 0;

        double[][] matrix = new double[12][12];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < matrix.length-i; i++) {
            for (int j = i+1; j < matrix.length-(i+1); j++) {
                result += matrix[i][j];
                div++;
            }
            if (i == Math.floorDiv(matrix.length, 2)-1) break;
        }

        if (operation == 'M') result /= div;

        System.out.printf("%.1f\n", result);

        sc.close();
    }
}
