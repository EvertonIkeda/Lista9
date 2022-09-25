package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int media=0, maior=0, matricula=0;
        int matriz[][] = new int[5][4];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o numero de matrícula: ");
            matriz[i][0] = sc.nextInt();
            System.out.println("Informe a media das provas: ");
            matriz[i][1] = sc.nextInt();
            System.out.println("Informe a media dos trabalhos: ");
            matriz[i][2] = sc.nextInt();
            matriz[i][3] = matriz[i][1] + matriz[i][2];
            if (i == 0) {
                maior = matriz[0][3];
                matricula = matriz[0][0];
            } else if (matriz[i][3] > maior) {
                maior = matriz[i][3];
                matricula = matriz[i][0];
            }
            media = media + matriz[i][3];
        }
        
        System.out.println(matricula + " obteve a maior nota");
        System.out.println("A media das notas finais é " + (media / 5));
    }
}