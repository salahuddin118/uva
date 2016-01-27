/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<String> inputs = new ArrayList<>();
        int length = 0;
        String s;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                break;
            }
            inputs.add(s);
            if (s.length() > length) {
                length = s.length();
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = inputs.size() - 1; j >= 0; j--) {
                String str = inputs.get(j);
                if (i < str.length()) {
                    out.printf(str.charAt(i) + "");
                } else {
                    out.printf(" ");
                }
            }
            out.printf("\n");
        }
    }
}
