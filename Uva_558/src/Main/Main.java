/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Salahuddin
 */
class Main {

    static class Edge {

        int x;
        int y;
        int t;

        Edge(int source, int destination, int weight) {
            x = source;
            y = destination;
            t = weight;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<Edge> edges = new ArrayList<>();
        int caseCount;
        int n, m;
        int[] d;

        // while there is some input to read
        while (in.hasNextInt()) {
            caseCount = in.nextInt();

            for (int i = 0; i < caseCount; i++) {
                n = in.nextInt();
                m = in.nextInt();
                edges.clear();

                for (int j = 0; j < m; j++) {
                    edges.add(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));
                }

                d = new int[n];
                for (int j = 0; j < n; j++) {
                    d[j] = Integer.MAX_VALUE / 2;
                }

                for (int j = 0; j < n - 1; j++) {
                    for (int k = 0; k < m; k++) {
                        if (d[edges.get(k).x] + edges.get(k).t < d[edges.get(k).y]) {
                            d[edges.get(k).y] = d[edges.get(k).x] + edges.get(k).t;
                        }
                    }
                }

                boolean has_neg_cycle = false;
                for (int j = 0; j < m; j++) {
                    if (d[edges.get(j).x] + edges.get(j).t < d[edges.get(j).y]) {
                        has_neg_cycle = true;
                    }
                }

                if (has_neg_cycle) {
                    out.printf("possible\n");
                } else {
                    out.printf("not possible\n");
                }
            }
        }
    }
}
