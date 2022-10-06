package codeup1007;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();

        int[] arr = new int[5];

        for (int i = 0; i< arr.length; i++){
            arr[i] = num % (int) Math.pow(10, i + 1);
            num -= arr[i];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("[%d]\n", arr[i]);
        }
    }
}
