package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1174 extends Problem {

    @Override
    public void problem() {
        setLevel(3);
        setNumber(1174);
        setCategory(Categories.BEGINNER);

        Scanner sc = new Scanner(System.in);
        Double[] a = new Double[100];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextDouble();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 10) {
                System.out.printf("A[%d] = %.1f%n", i, a[i]);
            }
        }
    }
}
