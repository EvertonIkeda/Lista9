package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma=0;
        double matriz[][] = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe um valor da matriz: ");
                matriz[i][j] = sc.nextDouble();
                if (i == j) {
                    soma = soma + matriz[i][i];
                }
            }
        }
        
        System.out.println("A soma dos valores na diagonal principal é " + soma);
    }
}