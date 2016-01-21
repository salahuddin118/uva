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
        ArrayList<Long> results = new ArrayList<>();

        // Preprocessing
        results.add((long) 1);
        results.add((long) 2);
        for (int i = 2; i < 50; i++) {
            results.add(results.get(i - 1) + results.get(i - 2));
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
