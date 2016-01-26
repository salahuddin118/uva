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

    //2^15 = 32768
    public static boolean[] primes = new boolean[32770];

    public static void calculate_prime() {

        for (int i = 2; i < primes.length; i++) {
            if (!primes[i]) {
                for (int j = 2; j * i < primes.length; j++) {
                    primes[j * i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int count;

        // while there is some input to read
        calculate_prime();
        while (in.hasNextInt()) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            count = 0;

            for (int i = n / 2; i >= 2; i--) {
                if (primes[i] == false) {
                    if (primes[n - i] == false) {
                        count++;
                    }
                }
            }
            out.printf("%d\n", count);
        }
    }
}
