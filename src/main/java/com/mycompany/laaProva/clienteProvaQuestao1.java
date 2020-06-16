/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laaProva;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @Amadeu Martim Silva De Oliveira - Laboratório de anlálise de algorítimo
 * Matricula: 1191114977
 */
public class clienteProvaQuestao1 {

    static String arquivo = "C:\\Users\\Dinopc\\Desktop\\coisas aleatorias\\file1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        //vértices totais do grafo
        final int numeroDeVertices = NumeroDeVertices();
        int i = 0;
        
        String[] numb = new String[numeroDeVertices];

        
        //carregar grafos em memoria
        List<Integer>[] grafo = new ArrayList[numeroDeVertices];
        carregarGrafosEmMemoria(grafo,numb);

        //imprimir quantidade de vertices
        imprimir(grafo, numeroDeVertices, numb, i);

        //calculando complexidade
        System.out.println("A complexidade deste grafo é:" + " " + calcularComplexidade(grafo, numeroDeVertices));
        System.out.println("Aluno: Amadeu Martim Silva De Oliveira \nMatrícula: 1191114977");
    }

    static int NumeroDeVertices() throws FileNotFoundException {
        int contador = 0;
        Scanner input = new Scanner(new FileReader(arquivo));
        while (input.hasNext()) {
            contador++;
            input.nextLine();
        }
        return contador;
    }

    static void ligarGrafo(List[] grafo) {
        for (int i = 0; i < grafo.length; i++) {
            grafo[i] = new ArrayList<Integer>();
        }
 
    }

    static int calcularComplexidade(List[] grafo, int numeroDeVertices) {
        int numeroDeArestas = 0;
        for (List grafo1 : grafo) {
            numeroDeArestas += grafo1.size() - 1;
        }

        return (numeroDeVertices + numeroDeArestas);
    }

    static void carregarGrafosEmMemoria(List[] grafo, String[] numb) throws FileNotFoundException {
        ligarGrafo(grafo);
        int contador = 0;
        Scanner input = new Scanner(new FileReader(arquivo));
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] vertices = line.split("\t");
            
            for (String vertice : vertices) {
                grafo[contador].add(Integer.parseInt(vertice));
            }
            contador++;
        }
    }


static void imprimir(List[] grafo, int numeroDeVertices, String numb[], int i) {
        for (List grafo1 : grafo) {
            ++i;
            System.out.print(grafo1.get(0) + ": ");
            System.out.println("(quantidade de vértices adjacentes:" + " " + (grafo1.size() - 1) + ")");

        }
    }

}
