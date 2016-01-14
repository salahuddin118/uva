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
        int number;
        int coins[] = {1, 5, 10, 25, 50};
        long ways[] = new long[300001];

        ways[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < ways.length; j++) {
                ways[j] += ways[j - coins[i]];
            }
        }
        // while there is some input to read
        while (in.hasNextInt()) {
            number = in.nextInt();
            if(ways[number] == 1)
                out.printf("There is only 1 way to produce %d cents change.\n", number);
            else
                out.printf("There are %d ways to produce %d cents change.\n", ways[number], number);
        }
    }
}
