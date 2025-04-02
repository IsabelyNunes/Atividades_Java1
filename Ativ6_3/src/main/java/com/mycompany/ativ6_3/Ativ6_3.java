/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ativ6_3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ativ6_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float preco, quantidade, total;

        System.out.print("Digite o preco: ");
        preco = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite a quantidade: ");
        quantidade = Float.parseFloat(input.nextLine());
        
        total = (preco * quantidade);
        
        if (preco >= 1.0 && quantidade >= 1.0){
            System.out.println(total);
        }
        else{
            System.out.println("Erro");
        }
    }
}
