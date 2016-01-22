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
        String str;
        int[] count = new int[10];

        // while there is some input to read
        while (in.hasNextInt()) {
            input = in.nextInt();
            if (input == 0) {
                break;
            }

            factorial = new BigInteger("1");

            for (int i = 1; i <= input; i++) {
                factorial = factorial.multiply(new BigInteger("" + i));
            }

            str = factorial.toString();
            for (int i = 0; i < count.length; i++) {
                count[i] = 0;
            }
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '0':
                        count[0]++;
                        break;
                    case '1':
                        count[1]++;
                        break;
                    case '2':
                        count[2]++;
                        break;
                    case '3':
                        count[3]++;
                        break;
                    case '4':
                        count[4]++;
                        break;
                    case '5':
                        count[5]++;
                        break;
                    case '6':
                        count[6]++;
                        break;
                    case '7':
                        count[7]++;
                        break;
                    case '8':
                        count[8]++;
                        break;
                    case '9':
                        count[9]++;
                        break;
                }
            }

            out.printf("%d! --\n", input);
            for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    out.printf("\n");
                }
                if (i == 0 || i == 5) {
                    out.printf("   (%d)%5d", i, count[i]);
                } else {
                    out.printf("    (%d)%5d", i, count[i]);
                }
            }
            out.printf("\n");
        }
    }
}
