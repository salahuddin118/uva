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
        double[] x = new double[3];
        double[] y = new double[3];
        double[] m = new double[3];
        double[] b = new double[3];

        // while there is some input to read
        while (in.hasNextDouble()) {
            x[0] = in.nextDouble();
            y[0] = in.nextDouble();
            x[1] = in.nextDouble();
            y[1] = in.nextDouble();
            x[2] = in.nextDouble();
            y[2] = in.nextDouble();

            int i[] = {0, 1, 2};
            int j[] = {1, 2, 0};

            int k = 0;

            for (int n = 0; n < 3; n++) {
                if (k > 1 || Math.abs(y[j[n]] - y[i[n]]) < 1e-5) {
                    continue;
                }
                double bx = (x[i[n]] + x[j[n]]) / 2.0;
                double by = (y[i[n]] + y[j[n]]) / 2.0;
                m[k] = -(x[j[n]] - x[i[n]]) / (y[j[n]] - y[i[n]]);
                b[k] = -m[k] * bx + by;
                k++;
            }

            double fx = (b[1] - b[0]) / (m[0] - m[1]);
            double fy = fx * m[0] + b[0];
            double r = Math.sqrt(Math.pow(fx - x[1], 2) + Math.pow(fy - y[1], 2));
            out.printf("%.2f\n", 2 * 3.141592653589793 * r);
        }
    }
}
