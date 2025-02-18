package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1185 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1185);
        setCategory(Categories.BEGINNER);
        setDescription("");

        Scanner sc = new Scanner(System.in);

        char operation = sc.next().toUpperCase().charAt(0);
        double result = 0;
        int div = 0;

        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < (matrix.length-1)-i; j++) {
                result += matrix[i][j];
                div++;
            }
        }

        if (operation == 'M') result /= div;

        System.out.printf("%.1f\n", result);

        sc.close();
    }
}
