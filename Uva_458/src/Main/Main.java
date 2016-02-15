/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        String s;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                break;
            }
            for (int i = 0; i < s.length(); i++) {
                out.printf("%c", (char) (s.charAt(i) - ('1' - '*')));
            }
            out.println();
        }
    }
}
