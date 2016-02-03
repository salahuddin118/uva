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

    public static boolean checkRegion(int n, int m) {
        boolean[] regions = new boolean[n + 1];
        int position = 1;
        int count = 1;
        int check = 0;

        regions[position] = true;
        while (count < n) {
            position++;
            if (position > n) {
                position -= n;
            }
            if (!regions[position]) {
                check++;
                if (check == m) {
                    regions[position] = true;
                    count++;
                    check = 0;
                }
            }
        }

        return (position == 13);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int n, m = 1;

        // while there is some input to read
        while (in.hasNextInt()) {
            n = in.nextInt();
            if (n == 0) {
                break;
            }
            while (true) {
                if (checkRegion(n, m)) {
                    break;
                } else {
                    m++;
                }
            }
            out.println(m);
            m = 1;
        }
    }
}
