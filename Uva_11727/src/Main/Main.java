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
        int caseCount = in.nextInt();

        for (int i = 0; i < caseCount; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            numbers.clear();
            numbers.add(a);
            if (b >= a) {
                numbers.add(b);
            } else {
                numbers.add(0, b);
            }

            if (c < numbers.get(0)) {
                numbers.add(0, c);
            } else if (c < numbers.get(1)) {
                numbers.add(1, c);
            } else {
                numbers.add(c);
            }

            out.println("Case " + (i + 1) + ": " + numbers.get(1));
        }
    }
}
