/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<Integer> order = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        // while there is some input to read
        while (in.hasNextInt()) {
            int caseCount = in.nextInt();
            String blank = in.nextLine();
            for (int i = 0; i < caseCount; i++) {
                blank = in.nextLine();
                String orderStr = in.nextLine();
                String numberStr = in.nextLine();

                order.clear();
                numbers.clear();

                StringTokenizer stOrder = new StringTokenizer(orderStr, " ");
                while (stOrder.hasMoreTokens()) {
                    order.add(Integer.parseInt(stOrder.nextToken()));
                }

                StringTokenizer stNumber = new StringTokenizer(numberStr, " ");
                while (stNumber.hasMoreTokens()) {
                    numbers.add(stNumber.nextToken());
                }

                for (int j = 0; j < order.size(); j++) {
                    out.printf("%s\n", numbers.get(order.indexOf(j + 1)));
                }
                if(i != (caseCount - 1))
                    out.printf("\n");
            }
        }
    }
}
