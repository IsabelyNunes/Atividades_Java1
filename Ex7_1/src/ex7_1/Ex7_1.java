/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7_1;

import java.util.Scanner;

/**
 *
 * @author alunolages
 */
public class Ex7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o numero 1: ");
        n1 = Integer.parseInt(input.nextLine());

        System.out.print("Digite o numero 2: ");
        n2 = Integer.parseInt(input.nextLine());

        if (n1 == n2) {
            System.out.println("iguais");
            
        } else {
            
            if (n1 >= n2) {  
                System.out.println("o primeiro numero eh maior");
            } 
            
            else {
                System.out.print("o segundo numero eh maior");
            }
        }

    }

}
