/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;
import javax.swing.JOptionPane;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class IfElse {

    public static void main(String[] args) {
       
            //Ativide TPA If e Else 
            
            // Utilizando < ou >
           
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            if (numero1 < numero2)
            JOptionPane.showMessageDialog(null, "O segundo número é maior");
            else if (numero1 > numero2)
            JOptionPane.showMessageDialog(null, "O primeiro número é maior.");
    
    
    
            // Utilizando != ou ==
            
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            if (num1 == num2)
            JOptionPane.showMessageDialog(null, "Os números são iguais");
            else if (numero1 != numero2)
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
    
    
            // Utilizando >= ou <=
           
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
            if (n1 >= n2)
            JOptionPane.showMessageDialog(null, "O primeiro número é maior ou igual ao segundo");
            else if (n1 <= n2)
            JOptionPane.showMessageDialog(null, "O primeiro número é menor ou igual ao segundo");
    }
    
}
