/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ52;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ativ52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int ano;
         boolean bissexto;
         
        System.out.print("Digite o ano: ");
        ano = Integer.parseInt(input.nextLine());
        
        bissexto = (ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0); 
        
        System.out.println("Ano bissexto? " +bissexto);
        
        
    }
    
}
