package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1177 extends Problem {

    @Override
    public void problem() {
        setLevel(1);
        setNumber(1177);
        setCategory(Categories.BEGINNER);
        setDescription("During 1000 entries it counts from X to Y");

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        int[] n = new int[1000];

        for (int i = 0; i < n.length; i++) {
            n[i] = y;
            y = y == x-1 ? 0 : y+1;
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }
    }
}
