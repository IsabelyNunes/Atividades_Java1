/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ54;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ativ54 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int diaAt, mesAt, anoAt, diaVenc, mesVenc, anoVenc;
        boolean vencida;

        System.out.print("Digite o dia atual: ");
        diaAt = Integer.parseInt(input.nextLine());

        System.out.print("Digite o mes atual: ");
        mesAt = Integer.parseInt(input.nextLine());

        System.out.print("Digite o ano atual: ");
        anoAt = Integer.parseInt(input.nextLine());

        System.out.print("Digite o dia de vencimento: ");
        diaVenc = Integer.parseInt(input.nextLine());
        
         System.out.print("Digite o mes de vencimento ");
        mesVenc = Integer.parseInt(input.nextLine());
        
         System.out.print("Digite o ano de vencimento ");
        anoVenc = Integer.parseInt(input.nextLine());
        
        
        vencida = (diaAt >= diaVenc) && (mesAt >= mesVenc) && (anoAt >= anoVenc);
        
        System.out.println("Vencida: " +vencida);
        

    }
}
