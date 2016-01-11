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
        ArrayList<String> names = new ArrayList<>();
        int adjacency_matrix[][];
        int caseCount = 0;
        int cityCount;
        int roadCount;
        String source, destination;
        int sourceIdx, destinationIdx;
        int roadWeight;

        // while there is some input to read
        while (in.hasNextInt()) {
            cityCount = in.nextInt();
            roadCount = in.nextInt();

            if (cityCount == 0 && roadCount == 0) {
                break;
            }
            caseCount++;

            names.clear();
            adjacency_matrix = new int[cityCount][cityCount];

            for (int i = 0; i < roadCount; i++) {
                source = in.next();
                destination = in.next();
                if (!names.contains(source)) {
                    names.add(source);
                }
                if (!names.contains(destination)) {
                    names.add(destination);
                }
                sourceIdx = names.indexOf(source);
                destinationIdx = names.indexOf(destination);
                roadWeight = in.nextInt();
                adjacency_matrix[sourceIdx][destinationIdx] = roadWeight;
                adjacency_matrix[destinationIdx][sourceIdx] = roadWeight;
            }

            source = in.next();
            destination = in.next();
            if (!names.contains(source)) {
                names.add(source);
            }
            if (!names.contains(destination)) {
                names.add(destination);
            }
            sourceIdx = names.indexOf(source);
            destinationIdx = names.indexOf(destination);

            for (int k = 0; k < cityCount; k++) {
                for (int i = 0; i < cityCount; i++) {
                    for (int j = 0; j < cityCount; j++) {
                        adjacency_matrix[i][j] = adjacency_matrix[j][i]
                                = Math.max(adjacency_matrix[i][j],
                                        Math.min(adjacency_matrix[i][k],
                                                adjacency_matrix[k][j]));
                    }
                }
            }

            out.printf("Scenario #%d\n", caseCount);
            out.printf("%d tons\n\n", adjacency_matrix[sourceIdx][destinationIdx]);
        }
    }
}
