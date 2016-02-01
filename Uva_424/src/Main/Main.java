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
        BigInteger result = new BigInteger("0");

        // while there is some input to read
        while (in.hasNextBigInteger()) {
            BigInteger num = in.nextBigInteger();
            if (num.toString().equalsIgnoreCase("0")) {
                break;
            }
            result = result.add(num);
        }
        out.printf(result.toString() + "\n");
    }
}
