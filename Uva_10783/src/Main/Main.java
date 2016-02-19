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

        int caseCount = in.nextInt();

        for (int i = 0; i < caseCount; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int sum = 0;

            if (start % 2 == 0) {
                start++;
            }
            for (; start <= end; start = start + 2) {
                sum += start;
            }

            out.printf("Case %d: %d\n", i + 1, sum);
        }
    }
}
