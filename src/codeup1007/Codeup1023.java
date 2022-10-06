package codeup1007;

import java.util.*;

public class Codeup1023 {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);

            String num = sc.nextLine();
            String[] spl = num.split("\\.");


            System.out.println(spl[0]);
            System.out.println(spl[1]);
        }
}

