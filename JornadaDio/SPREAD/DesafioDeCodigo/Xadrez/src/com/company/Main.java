package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int C = sc.nextInt();
        if (L>=1 && L<1000 && C>=1 && C<1000 && ( L+C ) %2==0)
            System.out.println(" 1  ");
        else
            System.out.println(" 0  ");
        sc.close();
    }
}
