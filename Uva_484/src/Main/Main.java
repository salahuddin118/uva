/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Salahuddin
 */
class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        ArrayList<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> mapping = new HashMap<>();
        int input;
        String s;

        // while there is some input to read
        while ((s = br.readLine()) != null) {
            if(s.equalsIgnoreCase(""))
                break;
            String[] tokens = s.split(" ");
            for (String token : tokens) {
                input = Integer.parseInt(token);
                if (!mapping.containsKey(input)) {
                    numbers.add(input);
                    mapping.put(input, 1);
                } else {
                    mapping.put(input, mapping.get(input) + 1);
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            out.printf("%d %d\n", numbers.get(i), mapping.get(numbers.get(i)));
        }
    }
}
