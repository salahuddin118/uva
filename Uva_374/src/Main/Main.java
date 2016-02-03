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
        BigInteger B, P, M;

        // while there is some input to read
        while (in.hasNextBigInteger()) {
            B = in.nextBigInteger();
            P = in.nextBigInteger();
            M = in.nextBigInteger();

            out.println(B.modPow(P, M).toString());
        }
    }
}
