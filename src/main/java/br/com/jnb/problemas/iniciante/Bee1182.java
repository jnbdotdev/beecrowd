package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1182 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1182);
        setCategory(Categories.BEGINNER);
        setDescription("Creates an array of values and performs the sum or average of one of its columns");

        Scanner sc = new Scanner(System.in);

        int column = sc.nextInt();
        double result = 0;
        char operation = sc.next().toUpperCase().charAt(0);

        double[][] matrix = new double[12][12];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextDouble();
            }
        }

        for (double[] doubles : matrix) {
            result += doubles[column];
        }
        if (operation == 'M') result /= matrix[column].length;


        System.out.printf("%.1f\n", result);
    }
}
