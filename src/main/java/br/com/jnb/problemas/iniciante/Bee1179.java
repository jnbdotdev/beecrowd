package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1179 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1179);
        setCategory(Categories.BEGINNER);
        setDescription("Fills two vectors, one with odd values and the other even.");

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> odd, even;
        odd = new ArrayList<Integer>(4);
        even = new ArrayList<Integer>(4);

        int[] values = new int[15];
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        for (int value : values) {
            if (value % 2 == 0) {
                even.add(value);
                if (even.size() == 5) {
                    for (int j = 0; j < even.size(); j++) {
                        System.out.printf("par[%d] = %d\n", j, even.get(j));
                    }
                    even.clear();
                }
            } else {
                odd.add(value);
                if (odd.size() == 5) {
                    for (int j = 0; j < odd.size(); j++) {
                        System.out.printf("impar[%d] = %d\n", j, odd.get(j));
                    }
                    odd.clear();
                }
            }
        }
        if (!odd.isEmpty()) {
            for (int j = 0; j < odd.size(); j++) {
                System.out.printf("impar[%d] = %d\n", j, odd.get(j));
            }
        }
        if (!even.isEmpty()) {
            for (int j = 0; j < even.size(); j++) {
                System.out.printf("par[%d] = %d\n", j, even.get(j));
            }
        }


    }
}
