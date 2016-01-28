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
        int size;
        boolean[][] matrix;
        int[] rowSum, columnSum;
        int count;
        int x, y;
        int countx, county;

        // while there is some input to read
        while (in.hasNextInt()) {
            size = in.nextInt();
            if (size == 0) {
                break;
            }

            matrix = new boolean[size][size];
            rowSum = new int[size];
            columnSum = new int[size];
            x = -1;
            y = -1;
            countx = 0;
            county = 0;

            for (int i = 0; i < size; i++) {
                count = 0;
                for (int j = 0; j < size; j++) {
                    if (in.nextInt() == 1) {
                        matrix[i][j] = true;
                        count++;
                    }
                }
                rowSum[i] = count;
            }

            for (int i = 0; i < size; i++) {
                count = 0;
                for (int j = 0; j < size; j++) {
                    if (matrix[j][i]) {
                        count++;
                    }
                }
                columnSum[i] = count;
            }

            for (int i = 0; i < size; i++) {
                if (rowSum[i] % 2 != 0) {
                    countx++;
                    x = i;
                }
                if (columnSum[i] % 2 != 0) {
                    county++;
                    y = i;
                }
            }

            if (countx == 0 && county == 0) {
                out.printf("OK\n");
            } else if (countx == 1 && county == 1) {
                out.printf("Change bit (%d,%d)\n", (x + 1), (y + 1));
            } else {
                out.printf("Corrupt\n");
            }
        }
    }
}
