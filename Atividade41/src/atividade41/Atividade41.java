/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade41;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Atividade41 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float nota1, nota2,nota3, mediaPonderada;
        int peso1, peso2, peso3;
        
        
        System.out.print("Digite a primeira nota: ");
        nota1 = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite o peso1: ");
        peso1 = Integer.valueOf(input.nextLine());
        
         System.out.print("Digite a segunda nota: ");
        nota2 = Float.parseFloat(input.nextLine());
        
         System.out.print("Digite o peso2: ");
        peso2 = Integer.valueOf(input.nextLine());
        
         System.out.print("Digite a terceira nota: ");
        nota3 = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite o peso3: ");
        peso3 = Integer.valueOf(input.nextLine());
        
        mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (float) (peso1 + peso2 + peso3);
        
        System.out.println("a sua media foi: "+mediaPonderada); 
        
        
               
    }
    
}
