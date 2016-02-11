/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int n, input = 0;
        Stack<Integer> cars = new Stack<>();

        // while there is some input to read
        while (in.hasNextInt()) {
            n = in.nextInt();

            if (n == 0) {
                break;
            }

            while (true) {
                cars.clear();
                int j = 0;
                for (int i = 0; i < n; i++) {
                    input = in.nextInt();
                    if (input == 0) {
                        break;
                    }

                    while (j < n && j != input) {
                        if (cars.size() > 0 && cars.lastElement() == input) {
                            break;
                        }
                        j++;
                        cars.push(j);
                    }
                    if (cars.lastElement() == input) {
                        cars.pop();
                    }
                }
                if (input == 0) {
                    break;
                }
                if (cars.isEmpty()) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }
            out.printf("\n");
        }
    }
}
