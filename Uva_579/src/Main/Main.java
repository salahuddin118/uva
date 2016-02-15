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

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int hour, min;
        double dhour, dmin, result;

        // while there is some input to read
        while (in.hasNext()) {
            String input = in.nextLine();
            hour = Integer.parseInt(input.substring(0, input.indexOf(':')));
            min = Integer.parseInt(input.substring(input.indexOf(':') + 1));

            if (hour == 0 && min == 0) {
                break;
            }

            dhour = (hour * 30 + min / 2.0) % 360;
            dmin = min * 6;

            if (dhour == dmin) {
                result = 0.0;
            } else if (dhour > dmin) {
                result = dhour - dmin;
            } else {
                result = dmin - dhour;
            }

            if (result > 180) {
                result = 360 - result;
            }

            out.printf("%.3f\n", result);
        }
    }
}
