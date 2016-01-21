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
        while (in.hasNextLong()) {
            long input = in.nextLong();
            // 3 * (2 * Math.pow(Math.floor((input + 2) / 2), 2) + 1) - 12
            long lineIndex = (long) Math.floor((input + 2) / 2);
            BigInteger aBigNumber = new BigInteger(Long.toString(lineIndex));
            BigInteger nextLineFirstNumber = aBigNumber.multiply(aBigNumber).multiply(new BigInteger("2")).add(new BigInteger("1"));
            BigInteger result = nextLineFirstNumber.multiply(new BigInteger("3")).add(new BigInteger("-12"));

            out.printf(result.toString() + "\n");
        }
    }
}
