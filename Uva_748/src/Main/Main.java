/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        BigDecimal result;
        String str;

        // while there is some input to read
        while (in.hasNextFloat()) {
            result = in.nextBigDecimal();
            int n = in.nextInt();

            result = result.pow(n);
            str = result.toPlainString();

            while (str.charAt(0) == '0') {
                str = str.substring(1);
            }
            int i = str.length() - 1;
            while (str.charAt(i--) == '0') {
                str = str.substring(0, str.length() - 1);
            }
            out.println(str);
        }
    }
}
