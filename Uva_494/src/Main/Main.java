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
            String[] tokens = s.split("[^a-zA-Z]");
            int result = 0;
            for (String token : tokens) {
                for (int i = 0; i < token.length(); i++) {
                    if ((token.charAt(i) >= 'a' && token.charAt(i) <= 'z')
                            || (token.charAt(i) >= 'A' && token.charAt(i) <= 'Z')) {
                        result++;
                        break;
                    }
                }
            }
            out.println(result);
        }
    }
}
