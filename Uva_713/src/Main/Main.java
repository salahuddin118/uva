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

    public static String numberReverse(BigInteger number) {
        String str1;
        StringBuilder stringBuilder;
        int position = 0;

        stringBuilder = new StringBuilder(number.toString());
        str1 = stringBuilder.reverse().toString();
        while (str1.charAt(position) == '0') {
            position++;
        }
        return str1.substring(position, str1.length());
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int caseCount = in.nextInt();
        BigInteger number1, number2;

        for (int i = 0; i < caseCount; i++) {
            number1 = in.nextBigInteger();
            number2 = in.nextBigInteger();

            number1 = new BigInteger(numberReverse(number1));
            number2 = new BigInteger(numberReverse(number2));

            out.printf(numberReverse(number1.add(number2)) + "\n");
        }
    }
}
