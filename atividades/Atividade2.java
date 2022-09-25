package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double soma;
        double matriz[][] = new double[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe um valor da matriz:");
                matriz[i][j] = sc.nextDouble();
            }
        }
        
        soma = matriz[1][0] + matriz[2][0] + matriz[2][1];
        
        System.out.println("A soma dos valores abaixo da diagonal principal é " + soma);
    }
}