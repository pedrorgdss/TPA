/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.algoritmotpa;

/**
 *
 * @author pedro
 */
public class AlgoritmoTPA {

    public static void main(String[] args) {
    /**Eu Pedro Rodrigues Pimentel estou fazendo o primeiro comentário em Java*/
    byte idade = 55; // Armazena números pequenos (-128 a 127)
    short ano = 2098; // Armazena valores um pouco maiores (-32.768 a 33.987)
    int populacaoDeUmaCidade = 300000; //abriga números inteiros
    long populacaoDoMundo = 8000000000L; //L para valores longos*/
    
    float altura = 1.87F; // valores decimais sempre com ponto e precisa de 'f'
    double peso = 65.6; // mais preciso que o float
    
    char UmaLetra = 'C'; // Um caractere só
    boolean ativo = true; //Armazena verdadeiro ou falso (true or false)
    
    // Para exibir os valores
    System.out.println("Idade: " + idade);
    System.out.println("Ano: " + ano);
    System.out.println("Populacao da cidade: " + populacaoDeUmaCidade);
    System.out.println("Populacao Mundial: " + populacaoDoMundo);
    System.out.println("Altura: " + altura + "m");
    System.out.println("Peso: " + peso + UmaLetra);
    System.out.println("Inicial do nome: " + UmaLetra);
    System.out.println("Esta ativo? " + ativo);
    }
}
