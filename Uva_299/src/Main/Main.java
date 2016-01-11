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
        int swapCount, temp;

        // while there is some input to read
        while (in.hasNextInt()) {
            int caseCount = in.nextInt();
            for (int i = 0; i < caseCount; i++) {
                int L = in.nextInt();
                swapCount = 0;
                numbers.clear();

                for (int j = 0; j < L; j++) {
                    numbers.add(in.nextInt());
                }

                for (int j = 0; j < L; j++) {
                    for (int k = j + 1; k < L; k++) {
                        if (numbers.get(j) > numbers.get(k)) {
                            //swap
                            temp = numbers.get(j);
                            numbers.set(j, numbers.get(k));
                            numbers.set(k, temp);
                            swapCount++;
                        }
                    }
                }
                out.printf("Optimal train swapping takes %d swaps.\n", swapCount);
            }
        }
    }
}
