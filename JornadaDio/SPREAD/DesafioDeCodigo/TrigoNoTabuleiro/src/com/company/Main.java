package com.company;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0 ; i<n ; i++) {
            int x = sc.nextInt();
            BigInteger  total =BigInteger.valueOf(2);
            total = total.pow(x);
            BigInteger  Kg = total.divide(BigInteger.valueOf(12000));
            System.out.println( Kg + " kg");
        }

        sc.close();
    }
}

