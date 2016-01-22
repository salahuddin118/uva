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
        long result;
        boolean[] used;

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int k = in.nextInt();

            if (n == 0 && k == 0) {
                break;
            }

            // nCk = nCn-k
            k = Math.min(k, n - k);
            result = 1;
            used = new boolean[k + 1];

            for (int i = 1; i <= k; i++) {
                result *= (n - k + i);
                for (int j = 2; j < used.length; j++) {
                    if (!used[j]) {
                        if (result % j == 0) {
                            result /= j;
                            used[j] = true;
                        }
                    }

                }
            }
            out.printf("%d\n", result);
        }
    }
}
