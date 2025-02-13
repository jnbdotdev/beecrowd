package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee1165 extends Problem {


    @Override
    public void problem() {
        setLevel(2);
        setNumber(1164);
        setCategory(Categories.BEGINNER);

        Scanner sc = new Scanner(System.in);

        int operations = sc.nextInt();

        sc.nextLine();

        for (int i = 0; i < operations; i++) {

            int number = sc.nextInt();

            boolean primo = true;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    System.out.println(number + " nao eh primo");
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(number + " eh primo");
            }

        }
    }
}
