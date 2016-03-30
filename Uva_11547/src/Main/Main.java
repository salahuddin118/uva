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

        // while there is some input to read
        int testCase = in.nextInt();

        for (int i = 0; i < testCase; i++) {
            int n = in.nextInt();
            // Simplified ((((n * 567) / 9) + 7492) * 235 / 47) - 498
            int result = ((n * 63 + 7492) * 5) - 498;
            result = (result % 100) / 10;
            if (result < 0) {
                result = -result;
            }
            out.printf("%d\n", result);
        }
    }
}
