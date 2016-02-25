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
        while (in.hasNextInt()) {
            int count = in.nextInt();
            boolean[] diff = new boolean[count];
            boolean result = true;

            int firstNumber = in.nextInt();
            for (int i = 1; i < count; i++) {
                int nextNumber = in.nextInt();
                if (!result) {
                    continue;
                }
                int ndiff = Math.abs(firstNumber - nextNumber);
                if (ndiff == 0) {
                    result = false;
                    continue;
                }
                if (ndiff >= count) {
                    result = false;
                    continue;
                }
                if (diff[ndiff]) {
                    result = false;
                    continue;
                }
                diff[ndiff] = true;
                firstNumber = nextNumber;
            }

            if (result) {
                out.printf("Jolly\n");
            } else {
                out.printf("Not jolly\n");
            }
        }
    }
}
