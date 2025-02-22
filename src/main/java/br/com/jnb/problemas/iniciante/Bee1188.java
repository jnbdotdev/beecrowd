package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1188 extends Problem {

    @Override
    public void problem() {
        setLevel(1);
        setNumber(1188);
        setCategory(Categories.BEGINNER);
        setDescription("Lower Area");

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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i && j > matrix.length-i-1) {
                    result += matrix[i][j];
                    div++;
                }
            }
        }

        if (operation == 'M') result /= div;

        System.out.printf("%.1f\n", result);

        sc.close();
    }
}