/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int caseCount = 0, sum, result;
        ArrayList<Integer> stacks = new ArrayList<>();

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            if (n == 0) {
                break;
            }

            caseCount++;
            stacks.clear();
            sum = 0;
            result = 0;

            for (int i = 0; i < n; i++) {
                int h = in.nextInt();
                sum += h;
                stacks.add(h);
            }

            int avgHeight = sum / n;

            for (int i = 0; i < n; i++) {
                if (stacks.get(i) > avgHeight) {
                    result += (stacks.get(i) - avgHeight);
                }
            }

            out.printf("Set #%d\nThe minimum number of moves is %d.\n\n", caseCount, result);
        }
    }
}
