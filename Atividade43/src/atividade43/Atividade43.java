/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade43;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Atividade43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float despesa, gorjeta, total;
        
        System.out.print("Digite a despesa: ");
        despesa = Float.parseFloat(input.nextLine());
        
        gorjeta = (despesa * 10/100);
        total = gorjeta + despesa;
        
        System.out.println("Gorjeta: "+gorjeta);
        System.out.println("Total: "+total);
    }
    
}
