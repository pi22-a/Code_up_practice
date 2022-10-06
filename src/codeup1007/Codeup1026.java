package codeup1007;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] arr = time.split(":");

        System.out.println(Integer.valueOf(arr[1]));
    }
}
