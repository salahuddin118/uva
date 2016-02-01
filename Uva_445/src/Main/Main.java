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
        int occurance = 0;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                out.printf("\n");
                continue;
            }

            for (int i = 0; i < s.length(); i++) {
                char achar = s.charAt(i);

                if (achar == '!') {
                    out.printf("\n");
                    continue;
                }
                if ((int) achar >= 48 && (int) achar <= 57) {
                    occurance += ((int) achar - 48);
                    continue;
                }
                for (int j = 0; j < occurance; j++) {
                    if (achar == 'b') {
                        out.printf(" ");
                    } else {
                        out.printf("%c", achar);
                    }
                }
                occurance = 0;
            }
            out.printf("\n");
        }
    }
}
