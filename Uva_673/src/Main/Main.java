/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        // while there is some input to read
        while (in.hasNextInt()) {
            int count = Integer.parseInt(in.nextLine());
            Stack<Character> aStack = new Stack();
            for (int i = 0; i < count; i++) {
                String str = in.nextLine();
                if (str.trim().equalsIgnoreCase("")) {
                    out.println("Yes");
                    continue;
                }

                for (int j = 0; j < str.length(); j++) {
                    char achar = str.charAt(j);

                    if (aStack.empty()) {
                        aStack.push(achar);
                    } else {
                        char stacktop = aStack.peek();
                        if ((achar == ')' && stacktop == '(') || (achar == ']' && stacktop == '[')) {
                            aStack.pop();
                        } else {
                            aStack.push(achar);
                        }
                    }
                }
                if (aStack.empty()) {
                    out.println("Yes");
                } else {
                    out.println("No");
                    aStack.clear();
                }
            }
        }
    }
}
