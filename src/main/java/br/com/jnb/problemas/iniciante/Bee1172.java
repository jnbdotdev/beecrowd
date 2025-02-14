package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1172 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1164);
        setCategory(Categories.BEGINNER);

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < x.length; j++) {
            if (x[j] <= 0) {
                x[j] = 1;
            }
        }
        for (int y = 0; y < x.length; y++) {
            System.out.printf("X[%d] = %d\n", y, x[y]);
        }
    }
}
