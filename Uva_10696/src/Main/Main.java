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

    public static int f91(int input) {
        if (input >= 101) {
            return input - 10;
        } else {
            return f91(f91(input + 11));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            out.printf("f91(%d) = %d\n", n, f91(n));
        }
    }
}
