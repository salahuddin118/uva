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

    static ArrayList<Integer> results = new ArrayList<>();

    public static int josephCircle(int k, int m) {
        int size = 2 * k;
        int current = (m - 1) % size;
        int i;

        for (i = 0; i < 2 * k; i++) {
            if (current < k) {
                break;
            }
            size--;
            current = (current + m - 1) % size;
        }
        return i;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        // Preprocessing
        for (int i = 1; i <= 14; i++) {
            for (int j = 1;; j++) {
                if (josephCircle(i, j) == i) {
                    results.add(j);
                    break;
                }
            }
        }

        // while there is some input to read
        while (in.hasNextInt()) {
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            out.printf("%d\n", results.get(input - 1));
        }
    }
}
