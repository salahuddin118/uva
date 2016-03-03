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
        boolean flag = true;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                break;
            }
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '"') {
                    if (flag) {
                        sb.setCharAt(i, '`');
                        sb.insert(i++, '`');
                        flag = false;
                    } else {
                        sb.setCharAt(i, '\'');
                        sb.insert(i++, '\'');
                        flag = true;
                    }
                }
            }
            out.println(sb.toString());
        }
    }
}
