/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade44;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Atividade44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int cdu, u, d, c ;
         
         System.out.print("CDU: ");
         cdu = Integer.valueOf(input.nextLine());
         
         u = cdu%10;
         d = (cdu/10)%10;
         c = (cdu/100);
        
         System.out.println("UDC: "+u+d+c);
  
         
    }
    
}
