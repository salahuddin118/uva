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

    public static final String VALID = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
    public static final String MIRROR = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";

    public static boolean checkPalindromes(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                result = false;
            }
        }
        return result;
    }

    public static boolean checkMiror(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length / 2 + length % 2; i++) {
            if (MIRROR.charAt(VALID.indexOf(input.charAt(i))) != input.charAt(length - 1 - i)) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);
        String s;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if (s.equalsIgnoreCase("")) {
                break;
            }

            s = s.trim();
            boolean isPalindrome = checkPalindromes(s);
            boolean isMirror = checkMiror(s);

            if (isPalindrome && isMirror) {
                out.println(s + " -- is a mirrored palindrome.\n");
            } else if (isMirror) {
                out.println(s + " -- is a mirrored string.\n");
            } else if (isPalindrome) {
                out.println(s + " -- is a regular palindrome.\n");
            } else {
                out.println(s + " -- is not a palindrome.\n");
            }
        }
    }
}
