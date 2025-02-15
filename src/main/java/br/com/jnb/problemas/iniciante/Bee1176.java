package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1176 extends Problem {

    @Override
    public void problem() {
        setLevel(3);
        setNumber(1176);
        setCategory(Categories.BEGINNER);
        setDescription("Find a value in the Fibonacci sequence by index");

        Scanner sc = new Scanner(System.in);

        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {
            int value = sc.nextInt();

            Long[] x = new Long[value+2];

            x[0] = 0L; x[1] = 1L;
            for (int j = 2; j < x.length; j++) {
                x[j] = x[j-1] + x[j-2];
            }

            for (int j = 0; j < x.length; j++) {
                if (j == value) {
                    System.out.printf("Fib(%d) = %d%n", j, x[j]);
                    break;
                }
            }

        }

    }
}
