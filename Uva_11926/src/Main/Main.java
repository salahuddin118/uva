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
            int n = in.nextInt();
            int m = in.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            boolean[] calender = new boolean[1000001];
            boolean conflict = false;

            for (int i = 0; i < n; i++) {
                int start = in.nextInt();
                int end = in.nextInt();

                if (conflict) {
                    continue;
                }

                for (int j = start; j < end; j++) {
                    if (calender[j]) {
                        conflict = true;
                        break;
                    } else {
                        calender[j] = true;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                int start = in.nextInt();
                int end = in.nextInt();
                int interval = in.nextInt();

                if (conflict) {
                    continue;
                }

                while (start < 1000001) {
                    for (int j = start; j < end && j < 1000001; j++) {
                        if (calender[j]) {
                            conflict = true;
                            break;
                        } else {
                            calender[j] = true;
                        }
                    }

                    start += interval;
                    end += interval;
                }
            }

            if (conflict) {
                out.println("CONFLICT");
            } else {
                out.println("NO CONFLICT");
            }
        }
    }
}
