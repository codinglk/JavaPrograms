package com.codinglk.programs;

import java.util.Scanner;

/**
 * @author codinglk
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain having max height)
 **/
class FindMaxValueIndexPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // game loop, take input for 3 times
        int takeInputIndex=0;
        System.out.println("######################################################################");
        while (takeInputIndex<3) {
            int highestMountainIndex =0;
            int oldV=0;
            for (int i = 0; i < 5; i++) {
                System.out.println("Enter the height of Mountain having index " +i);
                int mountainH = in.nextInt(); // represents the height of one mountain.
                if(mountainH>oldV){
                    highestMountainIndex = i;
                    oldV = mountainH;
                }
            }
            System.out.println("The index of the mountain having max height is "+highestMountainIndex); // The index of the mountain having max height
            System.out.println("######################################################################");
            ++takeInputIndex;
        }
    }
}

