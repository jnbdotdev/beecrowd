package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1178 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1178);
        setCategory(Categories.BEGINNER);
        setDescription("Just fill a vector with a calculated number sequence");

        Scanner sc = new Scanner(System.in);

        double[] n = new double[100];
        n[0] = sc.nextDouble();
        for (int i = 1; i < n.length; i++) {
            n[i] = n[i-1] / 2;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %.5f\n", i, n[i]);
        }

    }
}
