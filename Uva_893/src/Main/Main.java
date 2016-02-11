/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int input, day, month, year;
        Calendar calendar = Calendar.getInstance();

        // while there is some input to read
        while (in.hasNextInt()) {
            input = in.nextInt();
            day = in.nextInt();
            month = in.nextInt();
            year = in.nextInt();

            if (input == 0 && day == 0 && month == 0 && year == 0) {
                break;
            }

            month--;
            calendar.set(year, month, day);
            calendar.add(Calendar.DAY_OF_YEAR, input);

            out.printf("%d %d %d\n", calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
        }
    }
}
