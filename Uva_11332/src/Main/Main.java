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

    public static int summingDigits(int input) {
        int result = 0;

        while (input > 9) {
            result += input % 10;
            input /= 10;
        }
        result += input;
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int input;

        // while there is some input to read
        while (in.hasNextInt()) {
            input = in.nextInt();

            if (input == 0) {
                break;
            }

            while (input > 9) {
                input = summingDigits(input);
            }

            out.println(input);
        }
    }
}
