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

    public static int getValue(char c) {
        int result = -1;

        if (c >= 'a' && c <= 'z') {
            result = c - 'a';
        } else if (c >= 'A' && c <= 'Z') {
            result = c - 'A';
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int[] count = new int[26];

        // while there is some input to read
        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String input = in.nextLine();
            for (int j = 0; j < input.length(); j++) {
                int result = getValue(input.charAt(j));
                if (result != -1) {
                    count[result]++;
                }
            }
        }

        for (int i = 0; i < count.length; i++) {
            int index = 0;
            int value = count[index];

            for (int j = 1; j < count.length; j++) {
                if (count[j] > value) {
                    value = count[j];
                    index = j;
                }
            }
            if (value == 0) {
                break;
            }

            out.println(((char) ('A' + index)) + " " + value);
            count[index] = 0;
        }
    }
}
