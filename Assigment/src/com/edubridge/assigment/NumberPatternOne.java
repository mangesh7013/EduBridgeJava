package com.edubridge.assigment;
import java.util.Scanner;

public class NumberPatternOne {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Printing the pattern
        printPattern(n);
    }

    static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < i; j++) {
                if ((i + j) % 2 == 0) {
                    row.append("1 ");
                } else {
                    row.append("0 ");
                }
            }
            System.out.println(row.toString().trim()); 
        }


	}

}
