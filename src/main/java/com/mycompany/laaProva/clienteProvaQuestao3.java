/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laaProva;

import static com.mycompany.laaProva.clienteProvaQuestao1.arquivo;
import static com.mycompany.laaProva.clienteProvaQuestao1.ligarGrafo;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @Amadeu Martim Silva De Oliveira - Laboratório de anlálise de algorítimo
 * Matricula: 1191114977
 */

public class clienteProvaQuestao3 {

    static int numeroVertices2 = 5;

    public static void main(String[] args) {
        // arcos/arestas 1025-1027 1025-1028 1025-1026 1026-1025 1026-1027 1027-1028 1027-1029 1028-1029
        // 1025 - 0 // 1026 - 1// 1027 - 2// 1028 - 3// 1029 - 4
        
        int vertice[] = {1025,1026,1027,1028,1029};
        arestaQuestao3[][] matriz = new arestaQuestao3[numeroVertices2][numeroVertices2];
        ligarMatriz(matriz);
        matriz[0][2].valor = 1;
        matriz[0][3].valor = 1;
        matriz[0][1].valor = 1;
        matriz[1][0].valor = 1;
        matriz[1][2].valor = 1;
        matriz[2][3].valor = 1;
        matriz[2][4].valor = 1;
        matriz[3][4].valor = 1;
        print(matriz, vertice);
        System.out.println("Aluno:Amadeu Martim Silva De Oliveira \nMatricula:1191114977");
    }



    public static void ligarMatriz(arestaQuestao3[][] matriz) {
        for (int i = 0; i < numeroVertices2; i++) {
            for (int j = 0; j < numeroVertices2; j++) {
                matriz[i][j] = new arestaQuestao3();
            }
        }
    }
    
    

    static void print(arestaQuestao3[][] matriz, int []vertice) {
        System.out.println("      1025 1026 1027 1028 1029");
        for (int g = 0; g < numeroVertices2; g++) {
            System.out.print(vertice[g] + ": ");
            for (int r = 0; r < numeroVertices2; r++) {
                System.out.print(" "+ matriz[g][r].valor + "   ");
            }
            System.out.println();
        }
    }
}
