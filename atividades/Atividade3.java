package com.mycompany.atividades;

import java.util.Random;

public class Atividade3 {
    
    public static void main(String[] args) {
        Random random = new Random();
    
        int valor;
        boolean igual=false;
        int cartela[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                do {
                    valor = random.nextInt(99);
                    igual = false;
                    for (int k = 0; k < 5; k++) {
                        for (int l = 0; l < 5; l++) {
                            if (cartela[k][l] == valor) {
                                igual = true;
                                break;
                            }
                        }
                    }
                } while (igual);
                cartela[i][j] = valor;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                System.out.print(cartela[i][j] + "  ");
            }
        }
    }
}