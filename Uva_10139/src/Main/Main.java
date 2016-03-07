/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    static long get_powers(int n, int p) {
        long res = 0;
        for (long power = p; power <= n; power *= p) {
            res += n / power;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<Integer> factors = new ArrayList<>();

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int m = in.nextInt();

            if (m <= n) {
                out.println(m + " divides " + n + "!");
                continue;
            }

            int temp = m;
            factors.clear();

            for (int i = 2; i * i <= temp; i++) {
                if (temp % i == 0) {
                    factors.add(i);
                    temp = temp / i;
                    i = 1;
                }
            }
            if (temp > 1) {
                factors.add(temp);
            }

            if (factors.size() == 1) // prime
            {
                out.println(m + " does not divide " + n + "!");
            } else {
                int count = 1;
                int lastFactor = factors.get(0);
                for (int i = 1; i < factors.size(); i++) {
                    int currentFactor = factors.get(i);
                    if (currentFactor != lastFactor) {
                        // Do with lastFactor and count
                        long check = get_powers(n, lastFactor);
                        if (check < count) {
                            out.println(m + " does not divide " + n + "!");
                        }
                        // Reset
                        lastFactor = currentFactor;
                        count = 1;
                    } else {
                        count++;
                    }
                }
                long check = get_powers(n, lastFactor);
                if (check < count) {
                    out.println(m + " does not divide " + n + "!");
                } else {
                    out.println(m + " divides " + n + "!");
                }
            }
        }
    }
}
