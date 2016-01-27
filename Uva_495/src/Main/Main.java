/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<BigInteger> numbers = new ArrayList<>();

        // Preprocessing
        numbers.add(new BigInteger("0"));
        numbers.add(new BigInteger("1"));

        for (int i = 2; i < 5001; i++) {
            numbers.add(numbers.get(i - 1).add(numbers.get(i - 2)));
        }

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            out.printf("The Fibonacci number for %d is %s\n", n, numbers.get(n).toString());
        }
    }
}
