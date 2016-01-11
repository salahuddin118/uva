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

        // while there is some input to read
        while (in.hasNextInt()) {

            int input = in.nextInt();

            switch (input) {
                case 2:
                    for (int i = 0; i < 9; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (((i + j) * (i + j)) == (i * 10 + j)) {
                                System.out.printf("%02d\n", (i * 10 + j));
                            }
                        }
                    }
                    break;

                case 4:
                    for (int i = 0; i < 99; i++) {
                        for (int j = 0; j < 99; j++) {
                            if (((i + j) * (i + j)) == (i * 100 + j)) {
                                System.out.printf("%04d\n", (i * 100 + j));
                            }
                        }
                    }
                    break;

                case 6:
                    for (int i = 0; i < 999; i++) {
                        for (int j = 0; j < 999; j++) {
                            if (((i + j) * (i + j)) == (i * 1000 + j)) {
                                System.out.printf("%06d\n", (i * 1000 + j));
                            }
                        }
                    }
                    break;

                case 8:
                    for (int i = 0; i < 9999; i++) {
                        for (int j = 0; j < 9999; j++) {
                            if (((i + j) * (i + j)) == (i * 10000 + j)) {
                                System.out.printf("%08d\n", (i * 10000 + j));
                            }
                        }
                    }
                    break;
            }
        }
    }
}
