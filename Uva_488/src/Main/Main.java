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
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseCount; i++) {
            int amplitude = in.nextInt();
            int frequency = in.nextInt();

            for (int j = 0; j < frequency; j++) {
                for (int k = 0; k < amplitude * 2 - 1; k++) {
                    int l = (k + 1) > amplitude ? (2 * amplitude - k - 1) : (k + 1);
                    int count = l;
                    while (count-- > 0) {
                        sb.append(l);
                    }
                    sb.append("\n");
                }
                if (j != (frequency - 1)) {
                    sb.append("\n");
                }
            }
            if (i != (caseCount - 1)) {
                sb.append("\n");
            }
        }
        out.printf(sb.toString());
    }
}
