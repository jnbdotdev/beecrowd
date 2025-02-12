package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problema;

import java.util.Scanner;

public class Bee1164 extends Problema {

    public void problem() {

        setNivel(2);

        Scanner sc = new Scanner(System.in);

        int operacoes = sc.nextInt();

        for (int i = 0; i < operacoes; i++) {

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
