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
        int caseCount = in.nextInt();

        for (int i = 0; i < caseCount; i++) {
            BigInteger number = in.nextBigInteger();
            int result = 0;

            BigInteger revNumber = new BigInteger(new StringBuilder(number.toString()).reverse().toString());
            do {
                number = number.add(revNumber);
                revNumber = new BigInteger(new StringBuilder(number.toString()).reverse().toString());
                result++;
            } while (!number.equals(revNumber));
            out.println(result + " " + number.toString());
        }
    }
}
