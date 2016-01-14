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
        int Z, I, M, L;
        boolean[] track;
        int arandom, caseCount = 1, cycleLength;
        // while there is some input to read
        while (in.hasNextInt()) {
            Z = in.nextInt();
            I = in.nextInt();
            M = in.nextInt();
            L = in.nextInt();

            if(Z == 0 && I == 0 && M == 0 && L == 0)
                break;
            
            track = new boolean[M];
            cycleLength = 0;
            
            while(true)
            {
                arandom = (Z * L + I) % M;
                L = arandom;
                if(!track[arandom])
                {
                    track[arandom] = true;
                    cycleLength++;
                }
                else
                    break;
            }
            out.printf("Case %d: %d\n", caseCount, cycleLength);
            caseCount++;
        }
    }
}
