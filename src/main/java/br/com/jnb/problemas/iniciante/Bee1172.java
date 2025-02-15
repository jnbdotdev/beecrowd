package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1172 extends Problem {

    @Override
    public void problem() {
        setLevel(1);
        setNumber(1172);
        setCategory(Categories.BEGINNER);
        setDescription("Replaces numbers equal to or less than zero with 1");

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) {
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
