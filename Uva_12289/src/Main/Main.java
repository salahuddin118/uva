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

    public static int check(String input) {
        if (input.length() == 5) {
            return 3;
        } else {
            int dist1 = 0, dist2 = 0;
            if (input.charAt(0) != 'o') {
                dist1++;
            }
            if (input.charAt(1) != 'n') {
                dist1++;
            }
            if (input.charAt(2) != 'e') {
                dist1++;
            }

            if (input.charAt(0) != 't') {
                dist2++;
            }
            if (input.charAt(1) != 'w') {
                dist2++;
            }
            if (input.charAt(2) != '0') {
                dist2++;
            }

            if (dist1 < dist2) {
                return 1;
            } else {
                return 2;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        // while there is some input to read
        int caseCount = in.nextInt();
        in.nextLine();

        for (int i = 0; i < caseCount; i++) {
            out.println(check(in.nextLine()));
        }
    }
}
