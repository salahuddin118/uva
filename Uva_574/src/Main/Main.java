/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    static ArrayList<Integer> numbers = new ArrayList<>();
    static Map<ArrayList<Integer>, Boolean> solutions = new HashMap<>();
    static ArrayList<Integer> v = new ArrayList<>();
    static int targetSum;
    static int numberCount;

    static void search(int k, int m, int sum, ArrayList<Integer> v, PrintWriter out) {
        if (sum == targetSum) {
            if (solutions.get(v) != null) {
                if (solutions.get(v) == true) {
                    return;
                }
            }
            solutions.put(v, true);
            for (int i = 0; i < k; i++) {
                out.printf(i == k - 1 ? "%d" : "%d+", v.get(i));
            }
            out.printf("\n");
            return;
        }
        if (sum > targetSum || m == numberCount) {
            return;
        }
        for (int i = m; i < numberCount; i++) {
            v.add(numbers.get(i));
            search(k + 1, i + 1, sum + numbers.get(i), v, out);
            v.remove(v.size() - 1);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        // while there is some input to read
        while (in.hasNextInt()) {
            targetSum = in.nextInt();
            numberCount = in.nextInt();

            if (targetSum == 0 && numberCount == 0) {
                break;
            }

            numbers.clear();
            for (int i = 0; i < numberCount; i++) {
                numbers.add(in.nextInt());
            }

            solutions.clear();
            out.printf("Sums of %d:\n", targetSum);
            search(0, 0, 0, v, out);
            if (solutions.isEmpty()) {
                out.printf("NONE\n");
            }
        }
    }
}
