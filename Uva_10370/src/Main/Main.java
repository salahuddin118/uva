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
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum;

        // while there is some input to read
        int caseCount = in.nextInt();

        for (int i = 0; i < caseCount; i++) {
            int numberCount = in.nextInt();
            int result = 0;

            numbers.clear();
            sum = 0;

            for (int j = 0; j < numberCount; j++) {
                int number = in.nextInt();
                numbers.add(number);
                sum += number;
            }

            double avg = (sum * 1.0) / (numberCount * 1.0);

            for (int j = 0; j < numberCount; j++) {
                if (numbers.get(j) > avg) {
                    result++;
                }
            }

            out.printf("%.3f%%\n", result * 100.0 / (numberCount * 1.0));
        }
    }
}
