/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex6_4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex6_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float preco, total, totalAumento;
        int kW;
        char atraso;

        System.out.print("Digite o preco: ");
        preco = Float.parseFloat(input.nextLine());

        System.out.print("Digite os kWs: ");
        kW = Integer.parseInt(input.nextLine());

        System.out.print("Digite se esta em atraso (S/N): ");
        atraso = input.nextLine().charAt(0);

        total = preco * kW;
        totalAumento = (preco * kW) * 1.10f;

        if (atraso == 'S') {
            System.out.println(totalAumento);
        } else {
            System.out.println(total);
        }

    }
}
