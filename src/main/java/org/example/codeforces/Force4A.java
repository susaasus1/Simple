package org.example.codeforces;

import java.util.Scanner;

public class Force4A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();
        if (weight % 2 == 0 && weight != 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
