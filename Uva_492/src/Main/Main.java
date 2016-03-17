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

    static boolean isAlphabetic(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E'
                || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                || ch == 'u' || ch == 'U';
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // while there is some input to read
        while (true) {
            int input = br.read();
            if (input < 0) {
                break;
            }

            char ch = (char) input;

            if (isAlphabetic(ch)) {
                word.append(ch);
            } else {
                if (word.length() > 0) {
                    if (isVowel(word.charAt(0))) {
                        sb.append(word.toString()).append("ay");
                    } else {
                        sb.append(word.toString().substring(1)).append(word.charAt(0)).append("ay");
                    }
                    word = new StringBuilder();
                }
                sb.append(ch);
            }
        }
        out.print(sb);
    }
}
