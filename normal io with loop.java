package lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        int n = 51;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a maximum number [range]: ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
