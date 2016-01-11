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

        String order[] = {"BCG", "BGC", "CBG", "CGB", "GBC", "GCB"};
        long minOrder, temp;
        int minOrderPosition;

        // while there is some input to read
        while (in.hasNextInt()) {
            int b1 = in.nextInt();
            int g1 = in.nextInt();
            int c1 = in.nextInt();
            int b2 = in.nextInt();
            int g2 = in.nextInt();
            int c2 = in.nextInt();
            int b3 = in.nextInt();
            int g3 = in.nextInt();
            int c3 = in.nextInt();

            // Check all combination
            temp = b2 + b3 + c1 + c3 + g1 + g2;
            minOrder = temp;
            minOrderPosition = 0;

            temp = b2 + b3 + g1 + g3 + c1 + c2;
            if (temp < minOrder) {
                minOrder = temp;
                minOrderPosition = 1;
            }
            temp = c2 + c3 + b1 + b3 + g1 + g2;
            if (temp < minOrder) {
                minOrder = temp;
                minOrderPosition = 2;
            }
            temp = c2 + c3 + g1 + g3 + b1 + b2;
            if (temp < minOrder) {
                minOrder = temp;
                minOrderPosition = 3;
            }

            temp = g2 + g3 + b1 + b3 + c1 + c2;
            if (temp < minOrder) {
                minOrder = temp;
                minOrderPosition = 4;
            }

            temp = g2 + g3 + c1 + c3 + b1 + b2;
            if (temp < minOrder) {
                minOrder = temp;
                minOrderPosition = 5;
            }

            out.printf(order[minOrderPosition] + " " + minOrder + "\n");
        }
    }
}
