package codeup1007;

import java.util.Scanner;

public class Codeup1029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        String[] arr = num.split("\\.");

        while (arr[1].length() < 11) {
            arr[1] += "0";
        }

        System.out.println(arr[0] + "." + arr[1]);
    }
}
