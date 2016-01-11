/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static Stack<Integer> stack = new Stack<>();

    public static int[] topological(int adjacency_matrix[][]) {
        int number_of_nodes = adjacency_matrix[0].length;
        int[] topological_sort = new int[number_of_nodes];
        int pos = 0, i = 0, j;
        int visited[] = new int[number_of_nodes];

        while (!stack.isEmpty()) {
            int element = stack.peek();
            visited[element] = 1;
            while (i < number_of_nodes) {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 1) {
                    if (stack.contains(i)) {
                        System.out.println("TOPOLOGICAL SORT NOT POSSIBLE");
                        return null;
                    }
                }
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0) {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 0;
                    continue;
                }
                i++;
            }
            j = stack.pop();
            topological_sort[pos++] = j;
            i = 0;
        }
        return topological_sort;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Scanner in = new Scanner(new FileInputStream(args[0]));
        PrintWriter out = new PrintWriter(System.out, true);
        ArrayList<String> allInput = new ArrayList<>();
        int alphabetCount = 26;
        int[] letterIndex = new int[alphabetCount];
        int adjacency_matrix[][] = new int[alphabetCount][alphabetCount];
        int topological_sort[] = null;

        // while there is some input to read
        while (in.hasNextLine()) {
            String line = in.next().trim();
            allInput.clear();
            for (int i = 0; i < letterIndex.length; i++) {
                letterIndex[i] = 0;
                for (int j = 0; j < adjacency_matrix.length; j++) {
                    adjacency_matrix[i][j] = 0;
                }
            }
            while (!line.equalsIgnoreCase("#")) {
                allInput.add(line);
                line = in.next().trim();
            }

            int source = -1, destination;
            // for first column
            for (int j = 0; j < allInput.size(); j++) {
                String input = allInput.get(j);
                char achar = input.charAt(0);
                int charValue = achar - 65;
                if (letterIndex[charValue] == 0) {
                    letterIndex[charValue] = 1;
                    if (source == -1) {
                        source = charValue;
                    } else {
                        destination = charValue;
                        adjacency_matrix[source][destination] = 1;
                        //out.printf("" + (char) (source + 65) + "->" + (char) (destination + 65) + " ");
                        source = destination;
                    }
                }
            }

            String srcPrefix;
            // For other column
            for (int i = 1; i < 20; i++) {
                source = -1;
                srcPrefix = "";
                for (int j = 0; j < allInput.size(); j++) {
                    String input = allInput.get(j);
                    if (i < input.length()) {
                        char achar = input.charAt(i);
                        int charValue = achar - 65;
                        if (letterIndex[charValue] == 0) {
                            letterIndex[charValue] = 1;
                            //out.printf("" + achar);
                        }
                        if (source == -1) {
                            source = charValue;
                            srcPrefix = input.substring(0, i);
                        } else if (charValue != source) {
                            // check prefix
                            if (srcPrefix.equalsIgnoreCase(input.substring(0, i))) {
                                destination = charValue;
                                adjacency_matrix[source][destination] = 1;
                                //out.printf("" + (char) (source + 65) + "->" + (char) (destination + 65) + " ");
                                source = destination;
                            } else {
                                source = charValue;
                                srcPrefix = input.substring(0, i);
                            }
                        }
                    }
                }
            }

            // calculate topological ordering
            for (int i = 0; i < alphabetCount; i++) {
                boolean hasIncomingEdge = false;
                for (int j = 0; j < alphabetCount; j++) {
                    if (adjacency_matrix[j][i] == 1) {
                        hasIncomingEdge = true;
                        break;
                    }
                }
                if (!hasIncomingEdge) {
                    stack.push(i);
                }
            }

            topological_sort = topological(adjacency_matrix);

            for (int i = topological_sort.length - 1; i >= 0; i--) {
                if (letterIndex[topological_sort[i]] == 1) {
                    out.printf("%c", (char) (topological_sort[i] + 65));
                }
            }
            out.printf("\n");
        }
    }
}
