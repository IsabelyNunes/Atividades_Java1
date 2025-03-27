/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ativ51c;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ativ51c {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        float nota1, nota2, nota3, media, faltas;
        boolean aprovado, atestado;

        System.out.print("Digite a primeira nota: ");
        nota1 = Float.parseFloat(input.nextLine());

        System.out.print("Digite a segunda nota: ");
        nota2 = Float.parseFloat(input.nextLine());

        System.out.print("Digite a terceira nota: ");
        nota3 = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite as faltas: ");
        faltas = Float.parseFloat(input.nextLine());
        
        System.out.print("Tem atestado? ");
        atestado = Boolean.parseBoolean(input.nextLine());
        
        media = (nota1 + nota2 + nota3) / 3;
        
        aprovado = media >= 6 && faltas <= 25 || media >= 6 && faltas >= 25 && atestado && true ;
           
        System.out.println("Sua media eh " +media);
        System.out.println("Aprovado ou reprovado: " +aprovado);    
    }
}
