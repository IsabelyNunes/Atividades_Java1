/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ6_1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ativ6_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o numero 1: ");
        n1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Digite o numero 2: ");
        n2 = Integer.parseInt(input.nextLine());
        
        if (n1 == n2){
              System.out.println("iguais");
        }
        else{
            System.out.println("diferentes");
        }
    }
}
