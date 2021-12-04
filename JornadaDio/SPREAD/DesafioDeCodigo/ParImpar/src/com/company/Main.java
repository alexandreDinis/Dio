package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            int ent = leitor.nextInt();

            if(ent<0&&ent%2==0) {
                System.out.printf("EVEN NEGATIVE\n");
            }else if(ent>0&&ent%2==0) {
                System.out.printf("EVEN POSITIVE\n");
            }else if(ent<0&&ent%2!=0) {
                System.out.printf("ODD NEGATIVE\n");
            }else if(ent>0&&ent%2!=0) {
                System.out.printf("ODD POSITIVE\n");
            }else {
                System.out.printf("NULL\n");
            }

        }
    }

}