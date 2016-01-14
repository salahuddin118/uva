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
        int input;
        BigInteger factorial;

        // while there is some input to read
        while (in.hasNextInt()) {
            input = in.nextInt();
            factorial = new BigInteger("1");

            for (int i = 1; i <= input; i++) {
                factorial = factorial.multiply(new BigInteger("" + i));
            }
            out.printf("%d!\n", input);
            out.printf(factorial.toString() + "\n");
        }
    }
}
