package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;
import java.util.Scanner;

public class Bee1164 extends Problem {

    @Override
    public void problem() {
        setLevel(2);
        setNumber(1164);
        setCategory(Categories.BEGINNER);

        Scanner sc = new Scanner(System.in);

        int operations = sc.nextInt();

        for (int i = 0; i < operations; i++) {

            int r = 0;
            boolean perfeito = false;

            int number = sc.nextInt();

            for(int j = 1; j < number; j++) {

                r = r + j;

                if (r == number) {
                    System.out.println(number + " eh perfeito");
                    perfeito = true;
                    break;
                }
            }
            if (!perfeito) {
                System.out.println(number + " nao eh perfeito");
            }
        }

        sc.close();

    }
}
