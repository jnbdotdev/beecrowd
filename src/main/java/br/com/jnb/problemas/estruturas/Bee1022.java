package br.com.jnb.problemas.estruturas;

import br.com.jnb.problemas.Problem;
import java.util.Scanner;

public class Bee1022 extends Problem {

    @Override
    public void problem() {
        setLevel(4);
        setNumber(1022);
        setCategory(Categories.STRUCTURES);
        setDescription("Perform mathematical operations with fractions");

        Scanner sc = new Scanner(System.in);
        int operations = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < operations; i++) {
            String[] values = sc.nextLine().split(" ");

            int n1 = Integer.parseInt(values[0]);
            int d1 = Integer.parseInt(values[2]);
            String operator = values[3];
            int n2 = Integer.parseInt(values[4]);
            int d2 = Integer.parseInt(values[6]);

            System.out.println(calculate(n1, d1, n2, d2, operator));
        }

        sc.close();
    }

    private String calculate(int n1, int d1, int n2, int d2, String operator) {
        int n3 = 0, d3 = 0;

        switch (operator) {
            case "+": n3 = (n1 * d2) + (n2 * d1); d3 = d1 * d2; break;
            case "-": n3 = (n1 * d2) - (n2 * d1); d3 = d1 * d2; break;
            case "*": n3 = n1 * n2; d3 = d1 * d2; break;
            case "/": n3 = n1 * d2; d3 = n2 * d1; break;
        }

        int gcd = gcd(n3, d3);
        return String.format("%d/%d = %d/%d", n3, d3, n3 / gcd, d3 / gcd);
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }
}
