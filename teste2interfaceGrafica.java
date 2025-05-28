/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste2;

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class TESTE2 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Suau primeira nota: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Seu segundo número: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Seu terceiro número: "));
        d = Integer.parseInt(JOptionPane.showInputDialog("Seu quarto número: "));
        e = (a * b) + (a * c) + (a * d);
        JOptionPane.showMessageDialog(null, "O resultado é : " + e);
    }
}
