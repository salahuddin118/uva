/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author Salahuddin
 */
class Main {

    static long two = 1, three = 1, five = 1;
    static int flag = 0;

    static long Minimum() {
        long value = 0;

        if (((2 * two) <= (3 * three)) && ((2 * two) <= (5 * five))) {
            value = 2 * two;
            flag = 2;
        } else if (((3 * three) <= (2 * two)) && ((3 * three) <= (5 * five))) {
            value = 3 * three;
            flag = 3;
        } else if (((5 * five) <= (2 * two)) && ((5 * five) <= (3 * three))) {
            value = 5 * five;
            flag = 5;
        }
        return value;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;
        long number = 1;
        ArrayList<Long> uglyNumbers = new ArrayList<>();

        uglyNumbers.add(number);
        while (true) {
            number = Minimum();
            if (!uglyNumbers.contains(number)) {
                uglyNumbers.add(number);
                count++;
                if (count == 1500) {
                    break;
                }
            }
            switch (flag) {
                case 2:
                    two = (long) uglyNumbers.get(uglyNumbers.indexOf(two) + 1);
                    break;
                case 3:
                    three = (long) uglyNumbers.get(uglyNumbers.indexOf(three) + 1);
                    break;
                case 5:
                    five = (long) uglyNumbers.get(uglyNumbers.indexOf(five) + 1);
                    break;
                default:
                    break;
            }
        }
        System.out.println("The 1500'th ugly number is " + number + ".");
    }
}
