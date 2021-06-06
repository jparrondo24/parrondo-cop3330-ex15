package org.cop3330;

import java.util.Scanner;

public class App {
    static final String KNOWN_PASSWORD = "abc$123";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the username? ");
        String username = in.nextLine();
        System.out.print("What is the password? ");
        String password = in.nextLine();

        if (password.equals(KNOWN_PASSWORD)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
