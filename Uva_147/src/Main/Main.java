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
        double number;
        int temp;
        int coins[] = {5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000, 10000};
        long ways[] = new long[30001];

        ways[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < ways.length; j++) {
                ways[j] += ways[j - coins[i]];
            }
        }
        // while there is some input to read
        while (in.hasNextDouble()) {
            number = in.nextDouble();
            if (number == 0.00) {
                break;
            }
            temp = (int) Math.round(number * 100);
            out.printf("%6.2f%17d\n", number, ways[temp]);
        }
    }
}
