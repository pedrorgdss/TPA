/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio6javaswing;

/**
 *
 * @author pedro
 */
import javax.swing.JOptionPane;

public class Exercicio6javaswing {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        JOptionPane.showMessageDialog(null, "Antecessor: " + antecessor + "\nSucessor: " + sucessor);

    }
}
