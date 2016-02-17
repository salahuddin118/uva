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

    static StringBuilder sb = new StringBuilder();

    static void dfs(ArrayList<Integer> numbers, int n, int H, int i, int count) {
        if (i > n || count > H) {
            return;
        }

        if (i == n && count == H) {
            for (int j = 0; j < numbers.size(); j++) {
                sb.append(numbers.get(j));
            }
            sb.append("\n");
            return;
        }

        numbers.add(0);
        dfs(numbers, n, H, i + 1, count);
        numbers.remove(numbers.size() - 1);

        numbers.add(1);
        dfs(numbers, n, H, i + 1, count + 1);
        numbers.remove(numbers.size() - 1);
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<Integer> numbers = new ArrayList<>();

        // while there is some input to read
        int count = in.nextInt();

        for (int i = 0; i < count; i++) {
            int n = in.nextInt();
            int h = in.nextInt();

            numbers.clear();
            dfs(numbers, n, h, 0, 0);
            if (i != count - 1) {
                sb.append("\n");
            }
        }
        out.printf(sb.toString());
    }
}
