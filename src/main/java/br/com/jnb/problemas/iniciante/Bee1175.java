package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1175 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1175);
        setCategory(Categories.BEGINNER);
        setDescription("Reverse the order of the vector");

        Scanner sc = new Scanner(System.in);

        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length /2; i++) {
            int x = n[i];
            n[i] = n[(n.length-1)-i];
            n[(n.length-1)-i] = x;
        }
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, n[i]);
        }

        sc.close();
    }
}
