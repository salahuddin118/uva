/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int[] sums = new int[60001];

        for (int i = 1; i < 60001; i++) {
            for (int j = 2; i * j < 60001; j++) {
                sums[i * j] += i;
            }
        }

        out.println("PERFECTION OUTPUT");
        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            if (n == 0) {
                out.println("END OF OUTPUT");
                break;
            }
            if (sums[n] == n) {
                out.printf("%5d  PERFECT\n", n);
            } else if (sums[n] < n) {
                out.printf("%5d  DEFICIENT\n", n);
            } else {
                out.printf("%5d  ABUNDANT\n", n);
            }
        }
    }
}
