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
        BigInteger input;
        String numstr;
        int output;

        // while there is some input to read
        while (in.hasNextBigInteger()) {
            input = in.nextBigInteger();
            numstr = input.toString();
            if (numstr.equalsIgnoreCase("0")) {
                break;
            }

            int length = numstr.length();
            output = 0;
            for (int i = 0; i < length; i++) {
                switch (numstr.charAt(i)) {
                    case '0':
                        continue;
                    case '1':
                        output += (Math.pow(2, length - i) - 1);
                        break;
                    default:
                        output += (2 * (Math.pow(2, length - i) - 1));
                        break;
                }
            }

            out.printf("%d\n", output);
        }
    }
}
