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

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int a, b;
        int caseCount = in.nextInt();

        for (int i = 0; i < caseCount; i++) {
            a = in.nextInt();
            b = in.nextInt();

            if (a == b) {
                out.println("=");
            } else if (a > b) {
                out.println(">");
            } else {
                out.println("<");
            }
        }
    }
}
