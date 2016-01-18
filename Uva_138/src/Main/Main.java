/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out, true);
        int outputCount = 0;
        long i = 8;

        while (outputCount < 10) {
            double j = Math.sqrt(i * (i + 1) / 2);
            if (j == (int) j) {
                out.printf("%10d%10d\n", (int) j, i);
                outputCount++;
            }
            i++;
        }
    }
}
