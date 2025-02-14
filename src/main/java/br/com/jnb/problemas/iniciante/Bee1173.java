package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1173 extends Problem {

    @Override
    public void problem() {
        setLevel(1);
        setNumber(1173);
        setCategory(Categories.BEGINNER);

        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        x[0] = sc.nextInt();
        for (int i = 1; i < x.length; i++) {
            x[i] = x[i-1] * 2;
        }
        for (int y = 0; y < x.length; y++) {
            System.out.printf("N[%d] = %d\n", y, x[y]);
        }
    }
}

