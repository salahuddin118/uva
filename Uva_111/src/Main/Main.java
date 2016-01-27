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
        int count;

        // while there is some input to read
        while (in.hasNextInt()) {
            count = in.nextInt();
            int[] original = new int[count];
            int[] input = new int[count];
            int[][] lcs = new int[count + 1][count + 1];

            for (int i = 0; i < count; i++) {
                original[in.nextInt() - 1] = i;
            }
            while (in.hasNextInt()) {
                for (int i = 0; i < count; i++) {
                    input[in.nextInt() - 1] = i;
                }
                for (int i = 0; i < count + 1; i++) {
                    for (int j = 0; j < count + 1; j++) {
                        lcs[i][j] = 0;
                    }
                }
                for (int i = 1; i <= count; i++) {
                    for (int j = 1; j <= count; j++) {
                        if (original[i - 1] == input[j - 1]) {
                            lcs[i][j] = lcs[i - 1][j - 1] + 1;
                        } else {
                            lcs[i][j] = Math.max(lcs[i][j - 1], lcs[i - 1][j]);
                        }
                    }
                }
                out.printf("%d\n", lcs[count][count]);
            }
        }
    }
}
