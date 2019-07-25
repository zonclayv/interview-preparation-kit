package by.zonclayv.interview.arrays;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int combination = 0;
        for (int i = 0; i < c.length; i++) {

            if (c[i] == 0) {
                combination++;
            } else {
                combination = 0;
            }

            if (i == 0) {
                continue;
            }

            if (combination == 3) {
                combination = 1;
                steps--;
            } else if (combination == 0) {
                continue;
            }

            steps++;
        }

        return steps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 86;

        int[] c = {0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0};


        int result = jumpingOnClouds(c);


    }
}

