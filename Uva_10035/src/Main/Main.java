/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int carryCount, carry, c, d, sum;

        // while there is some input to read
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            carryCount = 0;
            carry = 0;

            while (true) {
                c = a % 10;
                d = b % 10;

                sum = c + d + carry;

                if (sum > 9) {
                    carry = 1;
                    carryCount++;
                } else {
                    carry = 0;
                }

                a /= 10;
                b /= 10;

                if (a == 0 && b == 0) {
                    break;
                }
            }

            switch (carryCount) {
                case 0:
                    out.println("No carry operation.");
                    break;
                case 1:
                    out.println("1 carry operation.");
                    break;
                default:
                    out.println(carryCount + " carry operations.");
                    break;
            }
        }
    }
}
