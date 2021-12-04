package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horasaida = sc.nextInt();
        int tempoviagem = sc.nextInt();
        int fuso = sc.nextInt();
        int res =0;

        if(horasaida <=0 || horasaida >=23){
            if(tempoviagem<=1|| tempoviagem <=12){
                if(fuso<=-5 || fuso<= 5){
                    res = tempoviagem+fuso+horasaida;
                    if(res>23){
                        System.out.printf("%d ",res);
                    }else{
                        System.out.print("0");
                    }

                }
            }
        }


        sc.close();
    }
}
