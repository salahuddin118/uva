/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        BigInteger[] allfactorials = new BigInteger[101];

        allfactorials[1] = BigInteger.ONE;
        for (int i = 2; i < allfactorials.length; i++) {
            allfactorials[i] = allfactorials[i - 1].multiply(new BigInteger(String.valueOf(i)));
        }
        // while there is some input to read
        while (in.hasNextInt()) {
            int N = in.nextInt();
            int M = in.nextInt();

            if (N == 0 && M == 0) {
                break;
            }

            if(N == M)
            {
                out.printf("%d things taken %d at a time is 1 exactly.\n", N, M);
            }
            else
            {
                BigInteger result = allfactorials[N].divide(allfactorials[N - M]);
                result = result.divide(allfactorials[M]);
                out.printf("%d things taken %d at a time is %s exactly.\n", N, M, result.toString());
            }
        }
    }
}
