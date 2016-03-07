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

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            BigInteger number = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                number = number.multiply(new BigInteger(i + ""));
            }

            String str = number.toString();
            int result = 0;

            for (int i = 0; i < str.length(); i++) {
                result += (str.charAt(i) - '0');
            }

            out.println(result);
        }
    }
}
