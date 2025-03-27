/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade42;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Atividade42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float medidaPe,polegadas,jardas,milhas;
        
        System.out.print("Digite a medida (pe) que voce deseja converter: ");
        medidaPe = Float.parseFloat(input.nextLine());
        
       polegadas = medidaPe * 12;
       jardas = medidaPe / 3;
       milhas = medidaPe / (1760*3);
       
       System.out.println("Polegadas: "+polegadas); 
       System.out.println("Jardas "+jardas); 
       System.out.println("Milhas "+milhas); 
        
    }
    
}
