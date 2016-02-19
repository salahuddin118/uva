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

        int caseCount = in.nextInt();
        for (int i = 0; i < caseCount; i++) {
            int farmarCount = in.nextInt();
            long budget = 0;

            for (int j = 0; j < farmarCount; j++) {
                long yardSize = in.nextInt();
                //int animalCount = 
                in.nextInt();
                long envFactor = in.nextInt();
                budget += (yardSize * envFactor);
            }
            out.println(budget);
        }
    }
}
