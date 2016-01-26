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
        //   0, 1, 2, 3, 4, 5, 6
        int[][] LCD = {
            {1, 1, 1, 0, 1, 1, 1},//0
            {0, 0, 1, 0, 0, 1, 0},//1
            {1, 0, 1, 1, 1, 0, 1},//2
            {1, 0, 1, 1, 0, 1, 1},//3
            {0, 1, 1, 1, 0, 1, 0},//4
            {1, 1, 0, 1, 0, 1, 1},//5
            {1, 1, 0, 1, 1, 1, 1},//6
            {1, 0, 1, 0, 0, 1, 0},//7
            {1, 1, 1, 1, 1, 1, 1},//8
            {1, 1, 1, 1, 0, 1, 1} //9
        };
        ArrayList<Integer> digits = new ArrayList();

        // while there is some input to read
        while (in.hasNextInt()) {
            int s = in.nextInt();
            int n = in.nextInt();

            if (s == 0 && n == 0) {
                break;
            }

            String str = Integer.toString(n);
            digits.clear();
            for (int i = 0; i < str.length(); i++) {
                digits.add(Integer.parseInt(str.charAt(i) + ""));
            }

            for (int i = 0; i < 7; i++) {
                if (i == 0 || i == 3 || i == 6) {
                    for (int j = 0; j < digits.size(); j++) {
                        // Top row spacing for position 1
                        out.printf(" ");
                        for (int k = 0; k < s; k++) {
                            if (LCD[digits.get(j)][i] == 0) {
                                out.printf(" ");
                            } else {
                                out.printf("-");
                            }
                        }
                        // Top row spacing for position 2
                        out.printf(" ");
                        // Digit spacing
                        if (j != (digits.size() - 1)) {
                            out.printf(" ");
                        }
                    }
                    out.printf("\n");
                } else {
                    for (int j = 0; j < s; j++) {
                        for (int k = 0; k < digits.size(); k++) {
                            if (LCD[digits.get(k)][i] == 0) {
                                out.printf(" ");
                            } else {
                                out.printf("|");
                            }

                            for (int l = 0; l < s; l++) {
                                out.printf(" ");
                            }
                            if (LCD[digits.get(k)][i + 1] == 0) {
                                out.printf(" ");
                            } else {
                                out.printf("|");
                            }
                            // Digit spacing
                            if (k != (digits.size() - 1)) {
                                out.printf(" ");
                            }
                        }
                        out.printf("\n");
                    }
                    i++;
                }
            }
            out.printf("\n");
        }
    }
}
