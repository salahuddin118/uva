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

    public static int collatzSequence(int a, int limit) {
        int steps = 0;
        long input = a;

        while (true) {
            steps++;
            if (input == 1) {
                break;
            }
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input = 3 * input + 1;
                if (input > limit) {
                    break;
                }
            }
        }
        return steps;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int caseCount = 1;

        // while there is some input to read
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int limit = in.nextInt();
            if (a == -1 && limit == -1) {
                break;
            }

            out.printf("Case %d: A = %d, limit = %d, number of terms = %d\n", caseCount++, a, limit, collatzSequence(a, limit));
        }
    }
}
