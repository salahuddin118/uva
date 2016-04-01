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
        boolean result;
        int index;

        // while there is some input to read
        while (in.hasNext()) {
            String s = in.next();
            String t = in.next();

            result = false;
            index = 0;

            for (int i = 0; i < s.length(); i++) {
                int newIndex = t.substring(index).indexOf(s.charAt(i));

                if (newIndex == -1) {
                    result = false;
                    break;
                } else {
                    index += (newIndex + 1);
                }

                if ((i + 1) == s.length()) {
                    result = true;
                }
            }

            if (result) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }
    }
}
