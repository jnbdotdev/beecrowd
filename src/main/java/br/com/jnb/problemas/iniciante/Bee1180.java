package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1180 extends Problem {

    @Override
    public void problem() {
        setLevel(3);
        setNumber(1180);
        setCategory(Categories.BEGINNER);
        setDescription("Get the index of the smallest value in the Array.");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        ArrayList<Integer> x = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            x.add(sc.nextInt());
        }
        ArrayList<Integer> z = new ArrayList<>(x);

        for (int i = 0; i < x.size(); i++) {
            for (int j = 1; j < x.size(); j++) {
                if (x.get(i) > x.get(j)) {
                    int temp = x.get(i);
                    x.set(i, x.get(j));
                    x.set(j, temp);
                }
            }
        }

        System.out.printf("Menor valor: %d\nPosicao: %d\n", x.getFirst(), z.indexOf(x.getFirst()));

    }
}
