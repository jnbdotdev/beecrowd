package br.com.jnb.problemas.iniciante;

import br.com.jnb.problemas.Problem;

import java.util.Scanner;

public class Bee2006 extends Problem {

    @Override
    public void problem() {
         setLevel(1);
         setNumber(2006);
         setCategory(Categories.BEGINNER);
         setDescription("Identifying Tea");

         Scanner sc = new Scanner(System.in);

         int correctTea = sc.nextInt();
         int[] attempts = new int[5];
         int correctOptions = 0;

        for (int i = 0; i < attempts.length; i++) {
            attempts[i] = sc.nextInt();
        }
        for (int attempt : attempts) {
            if (attempt == correctTea) correctOptions++;
        }

        System.out.println(correctOptions);

    }
}
