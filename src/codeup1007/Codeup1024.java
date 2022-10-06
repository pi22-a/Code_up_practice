package codeup1007;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        for(int i = 0; i < text.length(); i++) {
            System.out.printf("'%c'\n", text.charAt(i));
        }

    }
}
