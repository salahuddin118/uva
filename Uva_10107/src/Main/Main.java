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
        int startIndex, endIndex;
        long result;

        // while there is some input to read
        while (in.hasNextInt()) {
            int n = in.nextInt();

            startIndex = 0;
            endIndex = numbers.size();
            while (startIndex != endIndex) {
                if (numbers.get((startIndex + endIndex) / 2) > n) {
                    endIndex = (startIndex + endIndex) / 2;
                } else {
                    startIndex = ((startIndex + endIndex) / 2) + 1;
                }
            }
            numbers.add(startIndex, n);

            if (numbers.size() % 2 == 0) {
                result = ((long) numbers.get(numbers.size() / 2)
                        + (long) numbers.get((numbers.size() / 2) - 1)) / 2;
            } else {
                result = numbers.get((numbers.size() / 2));
            }
            out.printf("%d\n", result);
        }
    }
}
