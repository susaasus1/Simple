package org.example.codeforces;

import java.util.Scanner;

public class Force71A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        for (int i = 0; i < n; i++) {
            String stroke = scanner.next();
            if (stroke.length() > 10) {
                System.out.println(stroke.substring(0, 1) + (stroke.length() - 2) + stroke.substring(stroke.length() - 1, stroke.length() ));
            } else {
                System.out.println(stroke);
            }
        }
    }
}
