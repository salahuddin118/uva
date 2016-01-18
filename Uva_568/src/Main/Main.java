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
        String numstr;
        char output;

        // while there is some input to read
        while (in.hasNextInt()) {
            input = in.nextInt();
            factorial = new BigInteger("1");

            for (int i = 1; i <= input; i++) {
                factorial = factorial.multiply(new BigInteger("" + i));
            }
            
            numstr = factorial.toString();
            int length = numstr.length();
            while(true)
            {
                if(numstr.charAt(length - 1)!= '0')
                {
                    output = numstr.charAt(length - 1);
                    break;
                }
                length--;
            }
            out.printf("%5d -> %c\n", input, output);
        }
    }
}
