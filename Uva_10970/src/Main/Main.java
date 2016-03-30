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
        int result;
        // while there is some input to read
        while (in.hasNextInt()) {
            int m = in.nextInt();
            int n = in.nextInt();

            if (m > n) {
                result = n - 1 + n * (m - 1);
            } else {
                result = m - 1 + m * (n - 1);
            }
            out.printf("%d\n", result);
        }
    }
}
