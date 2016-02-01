/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        String s;
        BigInteger num1 = BigInteger.ZERO, num2 = BigInteger.ZERO, result = BigInteger.ZERO;
        BigInteger maxValue = new BigInteger(String.valueOf(Integer.MAX_VALUE));

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                break;
            }
            out.println(s);

            if (s.contains("+")) {
                String[] tokens = s.split("\\+");
                num1 = new BigInteger(tokens[0].trim());
                num2 = new BigInteger(tokens[1].trim());
                result = num1.add(num2);
            } else if (s.contains("*")) {
                String[] tokens = s.split("\\*");
                num1 = new BigInteger(tokens[0].trim());
                num2 = new BigInteger(tokens[1].trim());
                result = num1.multiply(num2);
            }

            if (num1.compareTo(maxValue) == 1) {
                out.println("first number too big");
            }
            if (num2.compareTo(maxValue) == 1) {
                out.println("second number too big");
            }
            if (result.compareTo(maxValue) == 1) {
                out.println("result too big");
            }
        }
    }
}
