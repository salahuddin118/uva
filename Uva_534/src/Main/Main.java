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

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<Integer> posx = new ArrayList<>();
        ArrayList<Integer> posy = new ArrayList<>();
        double adjacency_matrix[][];
        int caseCount = 0;
        int stoneCount;

        // while there is some input to read
        while (in.hasNextInt()) {
            stoneCount = in.nextInt();

            if (stoneCount < 2) {
                break;
            }
            caseCount++;
            posx.clear();
            posy.clear();
            for (int i = 0; i < stoneCount; i++) {
                posx.add(in.nextInt());
                posy.add(in.nextInt());
            }

            adjacency_matrix = new double[stoneCount][stoneCount];

            for (int j = 0; j < stoneCount; j++) {
                for (int k = 0; k < stoneCount; k++) {
                    adjacency_matrix[j][k] = Math.sqrt((posx.get(j) - posx.get(k)) * (posx.get(j) - posx.get(k))
                            + (posy.get(j) - posy.get(k)) * (posy.get(j) - posy.get(k)));
                }
            }

            for (int k = 0; k < stoneCount; k++) {
                for (int i = 0; i < stoneCount; i++) {
                    for (int j = 0; j < stoneCount; j++) {
                        adjacency_matrix[i][j] = Math.min(adjacency_matrix[i][j],
                                Math.max(adjacency_matrix[i][k], adjacency_matrix[k][j]));
                    }
                }
            }

            out.printf("Scenario #%d\n", caseCount);
            out.printf("Frog Distance = %.3f\n\n", adjacency_matrix[0][1]);
        }
    }
}
